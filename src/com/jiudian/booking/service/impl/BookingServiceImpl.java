package com.jiudian.booking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiudian.booking.dao.BookingDao;
import com.jiudian.booking.entity.Booking;
import com.jiudian.booking.service.BookingService;
import com.jiudian.core.base.BaseDao;
import com.jiudian.core.base.BaseServiceImpl;
import com.jiudian.room.entity.Room;
import com.jiudian.vip.entity.Vip;

@Service("BookingService")
public class BookingServiceImpl extends BaseServiceImpl<Booking> implements BookingService {

	@Autowired
	private BookingDao bookingDao;
	
	@Override
	public BaseDao<Booking> getBaseDao() {
		// TODO Auto-generated method stub
		return bookingDao;
	}

	@Override
	public void deleteBooking(Booking booking) {
		bookingDao.delete(booking);
		
	}

	@Override
	public void saveBooking(Booking booking, List<Room> list, Vip vip) {
		
		if(list.size()>0&&list.get(0).getRoomAble().equals("1"))
		{
			list.get(0);
			list.get(0).setRoomAble("0");
			booking.setRoomByRoomId(list.get(0));
			booking.setVipByVipId(vip);
			bookingDao.save(booking);
		}
		
	}

	



}
