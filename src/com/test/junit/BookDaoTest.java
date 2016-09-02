package com.test.junit;

import com.test.Dao.BookDao;
import com.test.Dao.hibImpl.BookDaoImpl;
import com.test.po.Book;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by lenovo on 2016/8/30.
 */
public class BookDaoTest {
    //Junit 4的测试方法
    //创建Book的对象
    BookDao bookDao;
    @Before
    public void setUp() throws Exception {
    //在setup()中声明实例化对象
        bookDao=new BookDaoImpl();
    }

    @Test
    public void insert() throws Exception {
        //创建一个Book 实例
        Book book=new Book();
        book.setName("java");
        book.setIsbn("isbnjava");
        book.setCover("javacover");
        book.setDiscount(5.5);
        book.setPrice(new BigDecimal(2.5));
        book.setSellnum(0);
        bookDao.insert(book);

    }

    @Test
    public void delete() throws Exception {
    Book book=new Book();
        book.setId(1);
        book.setName("jjj");
        bookDao.delete(book);
    }

    @Test
    public void delete1() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void findById() throws Exception {

    }

    @Test
    public void findByName() throws Exception {

    }

    @Test
    public void findAll() throws Exception {

    }

    @Test
    public void findByQBE() throws Exception {

    }

    @Test
    public void findByHQL() throws Exception {

    }

}