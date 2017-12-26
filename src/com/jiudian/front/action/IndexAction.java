package com.jiudian.front.action;

import com.jiudian.comment.entity.Comment;
import com.jiudian.comment.service.CommentManageService;
import com.jiudian.comment.vo.CommentVo;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class IndexAction extends ActionSupport {
    @Autowired
    private CommentManageService commentManageService;

    private String birthday;

    /**
     * 跳转到修改房间页面
     * */
    @Action(value = "/front/index",
            results = {@Result(name = "index", location = "/front/index.jsp")})
    public String index() {
        if(birthday==null || birthday.isEmpty()) {
            ServletActionContext.getContext().put("birthday", "");
        }
        List<Comment> comments = commentManageService.getAll();
        List<CommentVo> commentVos = new ArrayList<>();
        for(Comment temp : comments) {
            commentVos.add(new CommentVo(temp));
            if(commentVos.size()>=5) {
                break;
            }
        }
        ServletActionContext.getContext().put("comments", commentVos);
        ServletActionContext.getContext().put("birthday", birthday);
        return "index";
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
