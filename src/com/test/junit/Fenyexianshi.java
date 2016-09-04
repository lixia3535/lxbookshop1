package com.test.junit;

import com.test.po.Customer;

import java.util.List;

/**
 * Created by lenovo on 2016/9/3.
 */
public interface Fenyexianshi {
    /**
     * 分页查询
     * 查询条件
     * 一次查询几条记录
     * 查询的记录集合
     */
    public List<Customer> queryForPage(final String hql,
                                       final int offset,
                                       final int length);
    /***
     * 查询所有的记录
     * 查询条件
     * 总记录
     */
    public int getAllRowCount(String hql);

}
