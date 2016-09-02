package com.test.po;

import java.sql.Timestamp;

/**
 * Created by lenovo on 2016/8/29.
 */
public class Log {
    private int id;
    private String usn;
    private String ipAddress;
    private Timestamp operateTime;
    private String operateType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Timestamp getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Timestamp operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Log log = (Log) o;

        if (id != log.id) return false;
        if (usn != null ? !usn.equals(log.usn) : log.usn != null) return false;
        if (ipAddress != null ? !ipAddress.equals(log.ipAddress) : log.ipAddress != null) return false;
        if (operateTime != null ? !operateTime.equals(log.operateTime) : log.operateTime != null) return false;
        if (operateType != null ? !operateType.equals(log.operateType) : log.operateType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (usn != null ? usn.hashCode() : 0);
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + (operateType != null ? operateType.hashCode() : 0);
        return result;
    }
}
