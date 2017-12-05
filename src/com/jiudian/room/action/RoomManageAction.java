package com.jiudian.room.action;

import com.jiudian.room.service.RoomManageService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@ParentPackage("json-default")
@Namespace("/")
@Scope("prototype")
public class RoomManageAction extends ActionSupport{

    @Autowired
    private RoomManageService roomManageService;

    @Action(value = "/sys/room/findAllRoom",
            results = {@Result(name = "index", location = "/sys/")})
    public String findAllRoom() {
        this.roomManageService.findAllRoom();
        return "index";
    }
}

