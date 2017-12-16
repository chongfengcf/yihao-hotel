package com.jiudian.booking.service;

import java.util.List;

import com.jiudian.booking.entity.Booking;
import com.jiudian.core.base.BaseService;
import com.jiudian.room.entity.Room;
import com.jiudian.vip.entity.Vip;

public interface BookingService extends BaseService<Booking> {

	void deleteBooking(Booking booking);

	void saveBooking(Booking booking, List<Room> list, Vip vip);

}