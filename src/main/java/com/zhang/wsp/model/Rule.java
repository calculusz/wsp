package com.zhang.wsp.model;

/**
 * Created by zhang on 2016/11/25.
 */
public class Rule {
    private int id;
    private String name;
    private String description;

    public void setId(int id) {
        this.id = id;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {

        return id;
    }


    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
