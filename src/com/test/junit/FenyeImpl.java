package com.test.junit;

import com.test.po.Customer;

import java.util.List;

/**
 * Created by lenovo on 2016/9/3.
 */
public class FenyeImpl implements Fenyexianshi {
    @Override
    public List<Customer> queryForPage(String hql, int offset, int length) {

        return null;
    }

    @Override
    public int getAllRowCount(String hql) {
        return 0;
    }
}
