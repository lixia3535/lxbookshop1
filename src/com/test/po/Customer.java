package com.test.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2016/8/29.
 */
public class Customer {
    private int id;
    private String name;
    private String pwd;
    //一个用户对应一个用户详情，主表
    private Customerdetail customerdetail;

    //一个用户对应多个地址，主表
    private Set<Address> addresses=new HashSet<Address>();

    //一个用户对应多个订单----主表
    private Set<Order> orders=new HashSet<Order>();

    //一个用户对应多个购物车
    private Set<Cart> carts=new HashSet<Cart>();



    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Customerdetail getCustomerdetail() {
        return customerdetail;
    }

    public void setCustomerdetail(Customerdetail customerdetail) {
        this.customerdetail = customerdetail;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", customerdetail=" + customerdetail.getName() +
                ", addresses=" + addresses.size() +
                ", orders=" + orders.size() +
                ", carts=" + carts.size() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        if (pwd != null ? !pwd.equals(customer.pwd) : customer.pwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        return result;
    }
}
