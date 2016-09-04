package com.test.junit;

import com.test.Dao.CategroyDao;
import com.test.Dao.CustomerDao;
import com.test.Dao.hibImpl.CategroyDaoImpl;
import com.test.Dao.hibImpl.CustomerDaoImpl;
import com.test.po.Category;
import com.test.po.Customer;

/**
 * Created by lenovo on 2016/9/3.
 */
public class Main {
    public static void main(String[] args) {
      /*  //对顾客进行查找
        CategroyDao categroyDao=new CategroyDaoImpl();
        Category category=categroyDao.findById(1);
        System.out.println(category)*/

        CustomerDao  customerDao=new CustomerDaoImpl();
        Customer customer=customerDao.findById(1);
        System.out.println(customer);

    }
}
