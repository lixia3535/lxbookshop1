package com.test.po;

import java.math.BigDecimal;

/**
 * Created by lenovo on 2016/8/29.
 */
public class Orderdetail {
    private int id;
    private BigDecimal price;
    private Integer num;
    private BigDecimal subPrice;

    //一个订单详情对应一个订单  多的一遍
    private Order order;
    //一个订单详情对应一本书，一对多多的一边
    private Book book;


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getSubPrice() {
        return subPrice;
    }

    public void setSubPrice(BigDecimal subPrice) {
        this.subPrice = subPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orderdetail that = (Orderdetail) o;

        if (id != that.id) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (num != null ? !num.equals(that.num) : that.num != null) return false;
        if (subPrice != null ? !subPrice.equals(that.subPrice) : that.subPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (subPrice != null ? subPrice.hashCode() : 0);
        return result;
    }
}
