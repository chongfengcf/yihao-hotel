package com.jiudian.room.action;

import com.alibaba.fastjson.JSON;
import com.jiudian.room.entity.Room;
import com.jiudian.room.service.RoomManageService;
import com.jiudian.util.JsonReturn;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;

@Controller
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class RoomManageAction extends ActionSupport{

    @Autowired
    private RoomManageService roomManageService;

    private List<Room> list;
    @Action(value = "/sys/room/findAllRoom")
    public void findAllRoom() throws IOException {

        List<Room> list = this.roomManageService.getAll();
        JsonReturn jsonReturn = new JsonReturn();
        jsonReturn.setData(list);
        jsonReturn.setCount(10);
        String jsonstring = JSON.toJSONString(jsonReturn);
        ServletActionContext.getResponse().getWriter().write(jsonstring);
    }

    public List<Room> getList() {
        return list;
    }
}

