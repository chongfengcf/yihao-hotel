package com.jiudian.core.base;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@Repository
public class BaseDao<T> extends HibernateDaoSupport{


    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    private Class<T> clazz;

    //目的：得到实际类型参数.获取到T的类型
    private Class<T> getClazz() {
        if(clazz==null) {
            clazz = ((Class<T>) (((ParameterizedType) (this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]));
        }
        return clazz;
    }

    //保存
    public void save(T t) {
        this.getHibernateTemplate().save(t);
    }

    //删除
    public void delete(T t) {
        this.getHibernateTemplate().delete(t);
    }

    //更新
    public void update(T t) {
        this.getHibernateTemplate().update(t);
    }

    //根据id查询
    public T get(Serializable id) {
        return this.getHibernateTemplate().get(getClazz(), id);
    }

    //延迟加载
    public T load(Serializable id) {
        return this.getHibernateTemplate().load(getClazz(), id);
    }

    //查询所有
    public List<T> getAll() {
        return (List<T>)this.getHibernateTemplate().find("from "+getClazz().getSimpleName());
    }

    //用例子查询.从first开始的max个结果.从0开始计数
    public List<T> findByExample(T t) {
        return this.getHibernateTemplate().findByExample(t);
    }

    //执行hql语句
    public void executeHql(String hqlString, Object... values) {
        this.getHibernateTemplate().execute(new HibernateCallback<Query>() {
            @Override
            public Query doInHibernate(Session session) throws HibernateException {
                Query query = session.createQuery(hqlString);
                if (values != null)
                {
                    for (int i = 0; i < values.length; i++)
                    {
                        query.setParameter(i, values[i]);
                    }
                }
                query.executeUpdate();
                return null;
            }
        });
    }

    //使用hql语句查询
    public List<T> findByHql(String hqlString, Object... values) {
        return (List<T>)this.getHibernateTemplate().find(hqlString, values);
    }

}
