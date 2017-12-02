package com.jiudian.test.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


@Controller
@ParentPackage("struts-default")
@Namespace("/test")
@Scope("prototype")
@Action("testaction")
@Results(value = {@Result(name = "yemian", location = "/index.jsp")})
@AllowedMethods("showyemian")
public class TestAction extends ActionSupport {

    public String showyemian() {

        return "yemian";
    }

}
