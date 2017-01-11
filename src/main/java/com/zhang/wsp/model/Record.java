package com.zhang.wsp.model;

import sun.security.x509.IPAddressName;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/11/30.
 */
public class Record {
    Timestamp timestamp;
    String description;
    String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
