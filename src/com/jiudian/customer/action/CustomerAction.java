package com.jiudian.customer.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.jiudian.core.base.BaseAction;
import com.jiudian.customer.entity.Customer;
import com.jiudian.customer.service.CustomerService;
import com.jiudian.util.JsonReturn;
import com.jiudian.vip.entity.Vip;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@Controller
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class CustomerAction extends BaseAction implements ModelDriven<Customer> {

	private Customer customer = new Customer();
	
	public Customer getModel() {
		return customer;
	}
	
	@Autowired
	private CustomerService customerService ;
	
	private int page;
	private int limit;
	
	
	
	public void setPage(int page) {
		this.page = page;
	}



	public void setLimit(int limit) {
		this.limit = limit;
	}



	/*public void findAll() throws IOException
	{
		String josnString = customerService.findByPage(page,limit);
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		ServletActionContext.getResponse().getWriter().write(josnString);
	}*/

	@Action(value="/sys/customer/findAll")
	public void findAll() throws IOException
	{
		String josnString = customerService.findByPage();
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		ServletActionContext.getResponse().getWriter().write(josnString);
	}
	
	@Action(value="/sys/customer/findAllCustomer",results = {@Result(name = "findAll", location = "/customer/customer-list.jsp")})
	public String finddAllCustomer()
	{
		List<Customer> list = customerService.findAll();
		ActionContext.getContext().getValueStack().push(list);
		return "findAll";
	}
	
	@Action(value="/sys/custoemr/showMessage",results = {@Result(name = "showMessage", location = "/customer/customer-show.jsp")})
	public String showMessage()
	{
		
		customer = customerService.findbyId(customer.getId());
		return "showMessage";
	}
	
	@Action(value="/sys/custoemr/edit",results = {@Result(name = "edit", location = "/customer/customer-edit.jsp")})
	public String edit()
	{
		customer = customerService.findbyId(customer.getId());
		if(customer.getVipByVipId()!=null)
		{
			String vipid = customer.getVipByVipId().getId();
			ActionContext.getContext().getValueStack().push(vipid);
		}
		return "edit";
	}
	
	@Action(value="/sys/customer/updata")
	public void updata()
	{
		String vipid = request.getParameter("vipID");
		customerService.updataCustomer(customer);
	}
	
	@Action(value="/sys/customer/save")
	public void save()
	{
		String birthday = request.getParameter("birthday");
		customerService.addCustomer(customer,birthday);
	}
	
	@Action(value="/sys/customer/delete",results = {@Result(name = "delete" ,type="redirectAction",location = "findAllCustomer.action")})
	public String delete()
	{
		customer = customerService.findbyId(request.getParameter("id"));
		customerService.deleteCustomer(customer);
		return "delete";	
	}
}
