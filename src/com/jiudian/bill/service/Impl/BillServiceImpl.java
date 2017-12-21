package com.jiudian.bill.service.Impl;

import com.alibaba.fastjson.JSON;
import com.jiudian.bill.dao.BillDao;
import com.jiudian.bill.entity.Bill;
import com.jiudian.bill.service.BillService;
import com.jiudian.core.base.BaseDao;
import com.jiudian.core.base.BaseServiceImpl;
import com.jiudian.core.util.JsonReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("BillService")
@Transactional
public class BillServiceImpl extends BaseServiceImpl<Bill> implements BillService {

    @Autowired
    private BillDao billDao;

    @Override
    public String billsPagination(int page, int limit) {
        JsonReturn jsonReturn = new JsonReturn();
        List<Bill> bills = pagingBySql("SELECT * FROM bill", (page-1)*10, limit);
        jsonReturn.setData(bills);
        jsonReturn.setCount(rowCount("bill"));
        String jsonstring = JSON.toJSONString(jsonReturn);
        return jsonstring;
    }

    @Override
    public BaseDao<Bill> getBaseDao() {
        return billDao;
    }
}
