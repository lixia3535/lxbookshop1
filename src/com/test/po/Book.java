package com.test.po;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2016/8/29.
 */
public class Book {
    private int id;
    private String name;
    private String isbn;
    private BigDecimal price;
    private String cover;
    private Integer sellnum;
    private Double discount;
    //一本书对应多个购物车，是一对多一的一边
    private Set<Cart> carts=new HashSet<Cart>();

    //一本书可以对应多个订单详情
    private Set<Orderdetail> orderdetails=new HashSet<Orderdetail>();


    //书和出版社之间
    //一本书对应一个出版社  一对多，一的一边
    private Press press;


    //作者和书之间是多对多的关系
    private Set<Author> authors=new HashSet<Author>();


    //书和类之间的关系是多对多的关系
    private Set<Category> categories=new HashSet<Category>();


    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Press getPress() {
        return press;
    }

    public void setPress(Press press) {
        this.press = press;
    }

    public Set<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(Set<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }



    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getSellnum() {
        return sellnum;
    }

    public void setSellnum(Integer sellnum) {
        this.sellnum = sellnum;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (isbn != null ? !isbn.equals(book.isbn) : book.isbn != null) return false;
        if (price != null ? !price.equals(book.price) : book.price != null) return false;
        if (cover != null ? !cover.equals(book.cover) : book.cover != null) return false;
        if (sellnum != null ? !sellnum.equals(book.sellnum) : book.sellnum != null) return false;
        if (discount != null ? !discount.equals(book.discount) : book.discount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (cover != null ? cover.hashCode() : 0);
        result = 31 * result + (sellnum != null ? sellnum.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }
}
