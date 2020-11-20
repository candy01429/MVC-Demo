package com.model;

public class MyModel {

    private String name;
    public void setName(String s) {
        name = (s == null ? "Secret" : s);
    }
    public String getName() {
        return name;
    }

    public  int getNameLength() {
        return name.length();
    }
}
