package com.jiudian.vip.dao;

import org.springframework.stereotype.Repository;

import com.jiudian.core.base.BaseDao;
import com.jiudian.vip.entity.Vip;

@Repository
public class VipDao extends BaseDao<Vip> {

	public Vip returnVip(Vip vip) {

		save(vip);
		return vip;
	}

}
