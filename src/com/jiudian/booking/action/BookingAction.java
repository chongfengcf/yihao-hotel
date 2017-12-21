package com.jiudian.booking.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


import com.jiudian.room.entity.RoomType;
import com.jiudian.room.service.RoomTypeManageService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.jiudian.booking.entity.Booking;
import com.jiudian.booking.service.BookingService;
import com.jiudian.core.base.BaseAction;
import com.jiudian.customer.service.CustomerService;
import com.jiudian.room.entity.Room;
import com.jiudian.room.service.RoomManageService;
import com.jiudian.vip.entity.Vip;
import com.jiudian.vip.service.VipService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class BookingAction extends BaseAction implements ModelDriven<Booking> {
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private VipService vipService;
	
	private Booking booking = new Booking();
	
	private String vipPhone;
	private String roomTypeId;
	
	
	
	public void setVipPhone(String vipPhone) {
		this.vipPhone = vipPhone;
	}

	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	@Override
	public Booking getModel() {
		// TODO Auto-generated method stub
		return booking;
	}
	
	@Action(value = "/sys/booking/findAll",results = {@Result(name = "findAll",location = "/booking/booking-list.jsp")})
	public String findAll()
	{
		List<Booking> list = bookingService.getAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "findAll";
	}

	@Action(value = "/sys/booking/bookchecking",results = {@Result(name = "bookchecking",location = "/booking/booking-checkin.jsp")})
	public String bookchecking()
	{
		List<Booking> list = bookingService.getAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "bookchecking";
	}

	@Action(value = "/sys/booking/edit",results = {@Result(name = "edit",location = "/booking/booking-edit.jsp")})
	public String edit()
	{
		booking = bookingService.get(booking.getId());
		return "edit";
	}
	
	@Action(value = "/sys/booking/update")
	public void update() throws ParseException
	{
		booking = bookingService.get(booking.getId());
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd");
		booking.setArrivalDate(sdf.parse(request.getParameter("arrivalDate")));
		bookingService.update(booking);
	}

	@Action(value = "/sys/booking/delete",results = {@Result(name = "delete",type="redirectAction",location = "findAll")})
	public String delete()
	{
		booking = bookingService.get(booking.getId());
		bookingService.deleteBooking(booking);
		return "delete";
	}
	@Action(value = "/sys/booking/bookingRoom")
	public void bookingRoom()
	{
		List<Vip> vipList = vipService.findVip(vipPhone);
		if(vipList.isEmpty()){

		}
		else {
			Vip vip = vipList.get(0);
			bookingService.saveBooking(booking, roomTypeId, vip);
		}
	}
	
}
