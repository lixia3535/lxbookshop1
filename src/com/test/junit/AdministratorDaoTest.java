package com.test.junit;

import com.test.Dao.HibernateUntil;
import com.test.po.Administrator;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2016/8/31.
 */
public class AdministratorDaoTest {
    private AdministratorDao administratorDao;
    @Before
    public void setUp() throws Exception{
        System.out.println("setUp_____before");
        administratorDao = new AdministratorDao();
    }

    @Test
    public void insert() throws Exception {
    Session session= HibernateUntil.getSession();
        Administrator administrator=new Administrator();
        administrator.setLoginName("admin");
        administrator.setLoginPassword("admin");
        administratorDao.insert(administrator);
        List administrators=administratorDao.findByName("admin");
        Iterator iterator=administrators.iterator();
        if(iterator.hasNext()){
            Administrator a=(Administrator)iterator.next();
           assertEquals(a.getLoginName(),"admin");

        }

    }

    @Test
    public void delete() throws Exception {
    Session session=HibernateUntil.getSession();
        Administrator administrator=new Administrator();
        administrator.setLoginName("ll");
        administrator.setId(3);
        administrator.setLoginPassword("jj");
        administratorDao.delete(administrator);
        administrator=administratorDao.findById(3);

        assertNotNull(administrator);
    }

    @Test
    public void delete1() throws Exception {
    administratorDao.delete(2);
       Administrator administrator= administratorDao.findById(2);
        assertNotNull(administrator);
    }

    @Test
    public void update() throws Exception {
    Session session=HibernateUntil.getSession();
        Administrator administrator=administratorDao.findById(2);
        administrator.setLoginName("lixiaopa");
        administratorDao.update(administrator);
        administrator=administratorDao.findById(2);
        assertEquals(administrator.getLoginName(),"lixiaopa");
    }

    @Test
    public void findById() throws Exception {
    Session session=HibernateUntil.getSession();
        Administrator administrator=administratorDao.findById(1);
        assertEquals(administrator.getId(),1);
    }

    @Test
    public void findByName() throws Exception {
        Session session=HibernateUntil.getSession();
        List<Administrator> administrator=administratorDao.findByName("lixiaopa");
        assertEquals(administrator.size(),1);
    }

    @Test
    public void findAll() throws Exception {
        Session session=HibernateUntil.getSession();
        List<Administrator> administrator=administratorDao.findAll();
        assertEquals(administrator.size(),2);
    }

    @Test
    public void findByQBE() throws Exception {
        Session session=HibernateUntil.getSession();
        Administrator administrator=new Administrator();
        administrator.setLoginName("lixiaopa");
        administratorDao.findByQBE(administrator);
        assertNotNull(administrator);
    }

    @Test
    public void findByHQL() throws Exception {
        Session session=HibernateUntil.getSession();
        String sql="select * from Administrator administrator where administrator.name=?and administrator.id=?";
        administratorDao.findByHQL(sql,"lixiaopa","admin");


    }

}