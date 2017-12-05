package com.jiudian.core.base;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Override
    public abstract BaseDao<T> getBaseDao();

    @Override
    public void save(T t) {
        getBaseDao().save(t);
    }

    @Override
    public void delete(T t) {
        getBaseDao().delete(t);
    }

    @Override
    public void update(T t) {
        getBaseDao().update(t);
    }

    @Override
    public T get(Serializable id) {
        return getBaseDao().get(id);
    }

    @Override
    public List<T> getAll() {
        return getBaseDao().getAll();
    }

    @Override
    public void executeHql(String hqlString, Object... values) {
        getBaseDao().executeHql(hqlString,values);
    }

    @Override
    public List<T> findByHql(String hqlString, Object... values) {
        return getBaseDao().findByHql(hqlString,values);
    }

    @Override
    public T load(Serializable id) {
        return getBaseDao().load(id);
    }

    @Override
    public List<T> findByExample(T t) {
        return getBaseDao().findByExample(t);
    }

    @Override
    public List<T> findBySql(String sqlString) {
        return getBaseDao().findBySql(sqlString);
    }
}
