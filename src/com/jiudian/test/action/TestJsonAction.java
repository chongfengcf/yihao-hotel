package com.jiudian.test.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.HashMap;

@Controller
@ParentPackage("json-default")
@Namespace("/test")
@Action("testjsonaction")
@Results(value = {@Result(name = "jsonobj", type = "json", params = {"excludeProperties", "cnum"})})
@AllowedMethods("showjson")
public class TestJsonAction extends ActionSupport {

    private HashMap<String, String> map = new HashMap<>();
    private int age = 19;
    private int cnum = 3;

    public String showjson() {
        map.put("沈鑫", "shenxin");
        map.put("林凉席", "linliangxi");
        return "jsonobj";
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public int getAge() {
        return age;
    }

    public int getCnum() {
        return cnum;
    }
}
