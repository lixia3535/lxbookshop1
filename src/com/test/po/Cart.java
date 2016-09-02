package com.test.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2016/8/29.
 */
public class Cart {
    private int id;
    private Integer num;

    //一个购物车对应一个用户
    private Customer customer;
    //一个购物车对应一本书,多的一边
    private Book book;


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cart cart = (Cart) o;

        if (id != cart.id) return false;
        if (num != null ? !num.equals(cart.num) : cart.num != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (num != null ? num.hashCode() : 0);
        return result;
    }
}
