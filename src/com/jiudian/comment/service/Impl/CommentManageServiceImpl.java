package com.jiudian.comment.service.Impl;

import com.jiudian.comment.dao.CommentDao;
import com.jiudian.comment.entity.Comment;
import com.jiudian.comment.service.CommentManageService;
import com.jiudian.core.base.BaseDao;
import com.jiudian.core.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("CommentManageService")
@Transactional
public class CommentManageServiceImpl extends BaseServiceImpl<Comment> implements CommentManageService{

    @Autowired
    private CommentDao commentDao;

    @Override
    public BaseDao<Comment> getBaseDao() {
        return commentDao;
    }
}
