package com.test.po;

/**
 * Created by lenovo on 2016/8/29.
 */
public class Passport {
    private int id;
    private String passportnum;
    //一个passport对应一个用户详情
    private Customerdetail customerdetail;


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

    public String getPassportnum() {
        return passportnum;
    }

    public void setPassportnum(String passportnum) {
        this.passportnum = passportnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passport passport = (Passport) o;

        if (id != passport.id) return false;
        if (passportnum != null ? !passportnum.equals(passport.passportnum) : passport.passportnum != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (passportnum != null ? passportnum.hashCode() : 0);
        return result;
    }
}
