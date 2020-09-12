package com.example.bs.entity;

public class User {
    private String name;
    private String adrr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrr() {
        return adrr;
    }

    public void setAdrr(String adrr) {
        this.adrr = adrr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", adrr='" + adrr + '\'' +
                '}';
    }
}
