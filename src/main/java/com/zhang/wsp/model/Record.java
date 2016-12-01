package com.zhang.wsp.model;

import sun.security.x509.IPAddressName;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/11/30.
 */
public class Record {
    Timestamp timestamp;
    String description;
    String IP;

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

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }
}
