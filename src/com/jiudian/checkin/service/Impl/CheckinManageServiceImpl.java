package com.jiudian.checkin.service.Impl;

import com.jiudian.checkin.dao.CheckinDao;
import com.jiudian.checkin.dao.CustomerCheckinDao;
import com.jiudian.checkin.entity.Checkin;
import com.jiudian.checkin.entity.CustomerCheckin;
import com.jiudian.checkin.service.CheckinManageService;
import com.jiudian.core.base.BaseDao;
import com.jiudian.core.base.BaseServiceImpl;
import com.jiudian.customer.dao.CustomerDao;
import com.jiudian.customer.entity.Customer;
import com.jiudian.room.dao.RoomDao;
import com.jiudian.vip.dao.VipDao;
import com.jiudian.vip.entity.Vip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("CheckinManageService")
@Transactional
public class CheckinManageServiceImpl extends BaseServiceImpl<Checkin> implements CheckinManageService {

    @Autowired
    private CheckinDao checkinDao;

    @Autowired
    private VipDao vipDao;

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private RoomDao roomDao;

    @Autowired
    private CustomerCheckinDao customerCheckinDao;

    @Override
    public BaseDao<Checkin> getBaseDao() {
        return checkinDao;
    }

    @Override
    public void addcheckin(String roomid, String accesscardID, String notes, String vipphone, List<Customer> customers) {
        Vip vip = null;
        List<Vip> vips = vipDao.phoneFind(vipphone);

        //获取到会员信息
        if(vips!=null && !vips.isEmpty()) {
            vip = vips.get(0);
        }

        //获取顾客信息
        List<Customer> newcustomers = new ArrayList<>();
        for(Customer old : customers){
            List<Customer> customerstemp = customerDao.idcardFind(old.getCustomerCard());
            //如果会员信息存在那么更新
            if(customerstemp!=null && !customerstemp.isEmpty()) {
                Customer temp = customerstemp.get(0);
                temp.setCustomerName(old.getCustomerName());
                temp.setCustomerAddress(old.getCustomerAddress());
                temp.setCustomerPhone(old.getCustomerPhone());
                temp.setCustomerSex(old.getCustomerSex());
                customerDao.update(temp);
                newcustomers.add(temp);
            }
            //如果顾客信息不存在则新建
            else {
                customerDao.save(old);
                newcustomers.add(old);
            }
        }

        //插入一条入住记录
        Checkin checkin = new Checkin();
        checkin.setAccesscardId(accesscardID);
        checkin.setArrivalDate(new Date());
        checkin.setNotes(notes);
        checkin.setRoomByRoomId(roomDao.get(roomid));
        checkin.setVipByVipId(vip);
        save(checkin);

        //关联入住记录和顾客信息
        for(Customer temp : newcustomers) {
            CustomerCheckin customerCheckin = new CustomerCheckin();
            customerCheckin.setCheckinByCheckinId(checkin);
            customerCheckin.setCustomerByCustomerId(temp);
            customerCheckinDao.save(customerCheckin);
        }
    }
}
