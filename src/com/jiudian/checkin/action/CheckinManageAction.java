package com.jiudian.checkin.action;

import com.jiudian.checkin.service.CheckinManageService;
import com.jiudian.room.entity.Room;
import com.jiudian.room.service.RoomManageService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
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
public class CheckinManageAction extends ActionSupport {

    @Autowired
    private CheckinManageService checkinManageService;

    @Autowired
    private RoomManageService roomManageService;

    private String roomid;
    private String accesscardID;
    private String[] customerAddress;
    private String[] customerCard;
    private String[] customerName;
    private String[] customerPhone;
    private String[] customerSex;
    private String notes;

    /**
     * 显示所有可入住的房间
     * */
    @Action(value = "/sys/checkin/checkin",
            results = {@Result(name = "index", location = "/checkin/select-room.jsp")})
    public String index() {
        return "index";
    }

    /**
     * 跳转到办理入住页面
     * */
    @Action(value = "/sys/checkin/firstcheckin",
            results = {@Result(name = "firstcheckin", location = "/checkin/checkin-add.jsp")})
    public String firstcheckin() {
        Room room = roomManageService.get(roomid);
        ServletActionContext.getContext().put("room", room);
        return "firstcheckin";
    }

    /**
     * 新增入住信息
     * */
    @Action(value = "/sys/checkin/addcheckin",
            results = {@Result(name = "addcheckin", location = "/sys/ok.jsp")})
    public String addcheckin() {
        System.out.println(customerName.length);
        return "addcheckin";
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public void setAccesscardID(String accesscardID) {
        this.accesscardID = accesscardID;
    }

    public void setCustomerAddress(String[] customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerCard(String[] customerCard) {
        this.customerCard = customerCard;
    }

    public void setCustomerName(String[] customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String[] customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setCustomerSex(String[] customerSex) {
        this.customerSex = customerSex;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
