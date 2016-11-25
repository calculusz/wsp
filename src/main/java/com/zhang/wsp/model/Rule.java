package com.zhang.wsp.model;

/**
 * Created by zhang on 2016/11/25.
 */
public class Rule {
    private int id;
    private int ruleid;
    private String description;

    public void setId(int id) {
        this.id = id;
    }

    public void setRuleid(int ruleid) {
        this.ruleid = ruleid;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {

        return id;
    }

    public int getRuleid() {
        return ruleid;
    }

    public String getDescription() {
        return description;
    }
}
