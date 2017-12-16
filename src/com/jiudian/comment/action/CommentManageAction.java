package com.jiudian.comment.action;

import com.jiudian.comment.service.CommentManageService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class CommentManageAction extends ActionSupport{

    @Autowired
    private CommentManageService commentManageService;

    /**
     * 显示所有房间类型
     * */
    @Action(value = "/sys/comment",
            results = {@Result(name = "index", location = "/comment/comment.jsp")})
    public String index() {
        return "index";
    }
}
