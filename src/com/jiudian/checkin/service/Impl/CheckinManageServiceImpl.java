package com.jiudian.checkin.service.Impl;

import com.jiudian.checkin.dao.CheckinDao;
import com.jiudian.checkin.entity.Checkin;
import com.jiudian.checkin.service.CheckinManageService;
import com.jiudian.core.base.BaseDao;
import com.jiudian.core.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("CheckinManageService")
@Transactional
public class CheckinManageServiceImpl extends BaseServiceImpl<Checkin> implements CheckinManageService {

    @Autowired
    private CheckinDao checkinDao;

    @Override
    public BaseDao<Checkin> getBaseDao() {
        return checkinDao;
    }
}
