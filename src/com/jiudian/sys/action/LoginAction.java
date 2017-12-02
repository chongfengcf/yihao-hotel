package com.jiudian.sys.action;

import com.jiudian.sys.entity.SysUser;
import com.jiudian.sys.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@ParentPackage("json-default")
@Namespace("/")
@Scope("prototype")
public class LoginAction extends ActionSupport{

    @Autowired
    private LoginService loginService;


    @Action(value = "/sys/login", results = {@Result(name = "index", location = "/sys/login.jsp")})
    public String index() {
        return "index";
    }

    String state;
    String username;
    String password;
    String type;
    @Action(value = "/sys/login/logincheck", results = {@Result(name = "logincheck",type = "json", params = {"includeProperties", "state"})})
    public String logincheck() {
        SysUser sysUser = loginService.checkUser(username, password, type);
        if(sysUser!=null&&sysUser.getAble()==1) {
            state = "success";
        }
        return "logincheck";
    }



    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getState() {
        return state;
    }

}
