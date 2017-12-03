package com.jiudian.sys.action;

import com.jiudian.sys.entity.SysUser;
import com.jiudian.sys.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
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
        //如果还没有登录过则检查
        if(ServletActionContext.getRequest().getSession().getAttribute("sysuser")==null) {
            //检查用户密码是否正确
            SysUser sysUser = loginService.checkUser(username, password, type);
            //检验通过
            if (sysUser != null && sysUser.getAble() == 1) {
                //session记录登录信息
                ServletActionContext.getRequest().getSession().setAttribute("sysuser", sysUser);
                //返回登录成功标志
                state = "success";
            }
            else {
                state = "error";
            }
        }
        //登录过则跳过检查
        else {
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
