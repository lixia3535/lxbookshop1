package com.test.Dao.hibImpl;

import com.test.Dao.Generic;
import com.test.Dao.HibernateUntil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by lenovo on 2016/8/31.
 */
public class GenericBaseDao<Entity extends Object,ID extends Serializable> implements Generic<Entity,ID>{
  //在构造方法中获取Entity的类类型
    private Class<Entity> entityClazz;

    public GenericBaseDao() {
       this.entityClazz= (Class<Entity>)
                 ((ParameterizedType)this.getClass().getGenericSuperclass())
                         .getActualTypeArguments()[0];
    }

    @Override
    public void insert(Entity entity) {
        Session session= HibernateUntil.getSession();
        Transaction transaction=session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();

    }

    @Override
    public void delete(Entity entity) {
    Session session=HibernateUntil.getSession();
        Transaction transaction=session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(ID id) {
        Session session=HibernateUntil.getSession();
        Entity entity=(Entity)session.get(entityClazz,id);
        this.delete(entity);



    }

    @Override
    public void update(Entity entity) {
    Session session=HibernateUntil.getSession();
        Transaction transaction=session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public Entity findById(ID id) {
        Session session=HibernateUntil.getSession();
       Entity entity=  (Entity)session.get(entityClazz,id);
        return entity;
    }

    @Override
    public List<Entity> findByName(String name) {
        //先写一个HQL
        String hql="select * from"+this.entityClazz.getName() +"entity where entity.name=:name";
        //创建session
        Session session=HibernateUntil.getSession();
        Query query=session.createQuery(hql);
        query.setParameter("name",name);
        List<Entity> entities=query.list();

        return entities;
    }

    @Override
    public List<Entity> findAll() {
        String hql="select * from"+this.entityClazz.getName() ;
        //创建session
        Session session=HibernateUntil.getSession();
        Query query=session.createQuery(hql);
        List<Entity> entities=query.list();
        return entities;
    }

    @Override
    public List<Entity> findByQBE(Entity entity) {
        //通过QBE去查找
        //创建session
        Session session=HibernateUntil.getSession();
        Criteria criteria=session.createCriteria(entityClazz);
       Example entityExample=Example.create(entity);
        criteria.add(entityExample.ignoreCase().enableLike());
        List<Entity> entities=criteria.list();
        return entities;
    }

    @Override
    public List<Entity> findByHQL(String sql, Object... params) {
        Session session=HibernateUntil.getSession();
        Query query=session.createQuery(sql);
        if(params!=null){
            for (int i = 0; i < params.length; i++) {
                query.setParameter(i,params[i]);
            }
        }
       List<Entity> entities= query.list();
        return entities;
    }
}
