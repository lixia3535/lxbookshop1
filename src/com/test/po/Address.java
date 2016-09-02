package com.test.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2016/8/29.
 */
public class Address {
    private int id;
    private String address;
    private String zipecode;
    private String cellnum;
    //一个地址对应一个用户
    private Customer customer;
    //一个地址对应多个订单，so，address是主表
    private Set<Order> orders=new HashSet<Order>();


    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipecode() {
        return zipecode;
    }

    public void setZipecode(String zipecode) {
        this.zipecode = zipecode;
    }

    public String getCellnum() {
        return cellnum;
    }

    public void setCellnum(String cellnum) {
        this.cellnum = cellnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address1 = (Address) o;

        if (id != address1.id) return false;
        if (address != null ? !address.equals(address1.address) : address1.address != null) return false;
        if (zipecode != null ? !zipecode.equals(address1.zipecode) : address1.zipecode != null) return false;
        if (cellnum != null ? !cellnum.equals(address1.cellnum) : address1.cellnum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (zipecode != null ? zipecode.hashCode() : 0);
        result = 31 * result + (cellnum != null ? cellnum.hashCode() : 0);
        return result;
    }
}
