package com.jiudian.checkin.service;

import com.jiudian.checkin.entity.Checkin;
import com.jiudian.core.base.BaseService;
import com.jiudian.customer.entity.Customer;

import java.util.List;

public interface CheckinManageService extends BaseService<Checkin> {
    public void addcheckin(String roomid, String accesscardID, String notes, String vipphone, List<Customer> customers);
}
