package com.test.Dao;

import java.io.Serializable;
import java.util.List;


/**
 * Created by lenovo on 2016/8/30.
 */
public interface Generic<Entity extends Object,ID extends Serializable> {
    //让所有的Dao都实现这个接口，就不用每个都去写同样的字段
    //对实体类的CUDI
    //将实体类存入到数据库中
    public void insert(Entity entity);

    //删除实体类
    public void delete(Entity entity);
    public void delete(ID id);

    //更新实体类
    public void update(Entity entity);
    //对数据进行查找，1、根据id进行查找

    public Entity findById(ID id);

    public List<Entity> findByName(String name);

    public List<Entity> findAll();
    //根据QBC进行查找
    public List<Entity> findByQBE(Entity entity);

    public List<Entity> findByHQL(String sql,Object...params);

}
