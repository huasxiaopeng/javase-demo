package com.example.javasedemo.ios.files;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/30
 */
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

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
}