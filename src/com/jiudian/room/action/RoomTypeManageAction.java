package com.jiudian.room.action;

import com.jiudian.room.entity.RoomType;
import com.jiudian.room.service.RoomTypeManageService;
import com.jiudian.util.JsonReturn;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;


@Controller
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class RoomTypeManageAction {

    @Autowired
    private RoomTypeManageService roomTypeManageService;

    @Autowired
    private JsonReturn jsonReturn;

    private String id;
    private String roomTypeName;
    private String roomTypeDescription;
    /**
     * 显示所有房间类型
     * */
    @Action(value = "/sys/room/roomtype",
    results = {@Result(name = "index", location = "/room/roomType.jsp")})
    public String index() {
        List<RoomType> roomtypes = roomTypeManageService.getAll();
        ServletActionContext.getContext().put("roomtypes", roomtypes);
        return "index";
    }

    /**
     * 跳转到新增一个房间类型页面
     * */
    @Action(value = "/sys/room/addroomtype",
            results = {@Result(name = "toaddroomtype", location = "/room/roomType-add.jsp")})
    public String toaddroomtype() {
        ServletActionContext.getContext().put("roomtype", null);
        return "toaddroomtype";
    }

    /**
     * 保存或新增房间类型
     * */
    @Action(value = "/sys/room/saveroomtype",
            results = {@Result(name = "ok", location = "/sys/ok.jsp")})
    public String saveroomtype() {
        roomTypeManageService.saveroomtype(id, roomTypeName, roomTypeDescription);
        return "ok";
    }


    /**
     * 修改房间类型
     * */
    @Action(value = "/sys/room/updateroomtype")
    public void updateroomtype() {
        List<RoomType> roomtypes = roomTypeManageService.getAll();
        ServletActionContext.getContext().put("roomtypes", roomtypes);
    }

    /**
     * 删除房间类型
     * */
    @Action(value = "/sys/room/deleteroomtype")
    public void deleteroomtype() throws IOException {
        try {
            RoomType roomType = roomTypeManageService.get(id);
            roomTypeManageService.delete(roomType);
            jsonReturn.setMsg("success");
        }catch (Exception e) {
            jsonReturn.setMsg("error");
        }finally {
            ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
            ServletActionContext.getResponse().getWriter().write(jsonReturn.tojson());
        }
    }

    /**
     * 跳转到修改房间类型页面
     * */
    @Action(value = "/sys/room/getoneroomtype",
            results = {@Result(name = "getoneroomtype", location = "/room/roomType-add.jsp")})
    public String getoneroomtype() {
        RoomType roomType = roomTypeManageService.get(id);
        ServletActionContext.getContext().put("roomtype", roomType);
        return "getoneroomtype";
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public void setRoomTypeDescription(String roomTypeDescription) {
        this.roomTypeDescription = roomTypeDescription;
    }
}
