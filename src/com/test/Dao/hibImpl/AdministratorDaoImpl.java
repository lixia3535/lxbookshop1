package com.test.Dao.hibImpl;

import com.test.Dao.AdminisratorDao;
import com.test.Dao.Generic;
import com.test.Dao.HibernateUntil;
import com.test.po.Administrator;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import java.util.List;

/**
 * Created by lenovo on 2016/8/31.
 */
public class AdministratorDaoImpl extends GenericBaseDao<Administrator,Integer> implements AdminisratorDao {

}
