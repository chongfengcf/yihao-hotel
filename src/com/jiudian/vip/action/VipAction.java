package com.jiudian.vip.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.jiudian.core.base.BaseAction;
import com.jiudian.vip.entity.Vip;
import com.jiudian.vip.service.VipService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class VipAction extends BaseAction implements ModelDriven<Vip> {

	private Vip vip = new Vip();
	
	@Override
	public Vip getModel() {
		// TODO Auto-generated method stub
		return vip;
	}
	
	@Autowired
	private VipService vipService;
	
	
	@Action(value="/sys/vip/findAll",results = {@Result(name = "findAll", location = "/vip/vip-list.jsp")})
	public String findAll()
	{
		List<Vip> list = vipService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "findAll";
	}
	
	@Action(value="/sys/vip/edit",results = {@Result(name = "edit",location = "/vip/vip-edit.jsp")})
	public String edit()
	{
		vip = vipService.findById(vip.getId());
		return "edit";
	}
	
	@Action(value="/sys/vip/updata",results = {@Result(name = "updata" ,type="redirectAction",location = "findAll.action")})
	public String updata()
	{
		vipService.updataVip(vip);
		return "updata";
		
	}
	
	@Action(value="/sys/vip/delete",results = {@Result(name = "delete" ,type="redirectAction",location = "findAll.action")})
	public String delete()
	{
		vip = vipService.findById(vip.getId());
		vipService.deleteVip(vip);
		return "delete";
	}
	
	
	
}
