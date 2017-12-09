package com.jiudian.room.action;

import com.jiudian.room.service.RoomManageService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class RoomManageAction extends ActionSupport{

    @Autowired
    private RoomManageService roomManageService;

    private int limit;
    private int page;

    @Action(value = "/sys/room/findAllRoom")
    public void findAllRoom() throws IOException {
        String jsonstring = this.roomManageService.roomPagination(page, limit);
        ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
        ServletActionContext.getResponse().getWriter().write(jsonstring);
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

