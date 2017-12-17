package com.jiudian.comment.service.Impl;

import com.alibaba.fastjson.JSON;
import com.jiudian.comment.dao.CommentDao;
import com.jiudian.comment.entity.Comment;
import com.jiudian.comment.service.CommentManageService;
import com.jiudian.comment.vo.CommentVo;
import com.jiudian.core.base.BaseDao;
import com.jiudian.core.base.BaseServiceImpl;
import com.jiudian.core.util.JsonReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("CommentManageService")
@Transactional
public class CommentManageServiceImpl extends BaseServiceImpl<Comment> implements CommentManageService{

    @Autowired
    private CommentDao commentDao;

    @Override
    public BaseDao<Comment> getBaseDao() {
        return commentDao;
    }

    @Override
    public String commentPagination(int page, int limit, String keyword) {
        JsonReturn jsonReturn = new JsonReturn();
        List<Comment> comments;
        if(keyword!=null) {
            comments = commentDao.keywordFind(page, limit, keyword);
        }
        else {
            comments = pagingBySql("SELECT * FROM comment ORDER BY time", (page-1)*10, limit);
        }
        List<CommentVo> commentVos = new ArrayList<>();
        for(Comment temp : comments) {
            commentVos.add(new CommentVo(temp));
        }
        jsonReturn.setData(commentVos);
        jsonReturn.setCount(rowCount("comment"));
        String jsonstring = JSON.toJSONString(jsonReturn);
        return jsonstring;
    }

    @Override
    public void savecomment(String id, String content) {
        Comment comment = get(id);
        comment.setContent(content);
        saveOrUpdate(comment);
    }
}
