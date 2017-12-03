package com.jiudian.room.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@ParentPackage("json-default")
@Namespace("/")
@Scope("prototype")
public class RoomManageAction extends ActionSupport{
}
