package com.wxl.entity;

public class User {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public User(int id, String name) {
        super();
        this.id = id;
        this.name = name;


    }
}
