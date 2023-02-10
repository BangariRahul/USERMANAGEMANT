package com.example.user.model;

public class User {
    private int userid;
    private String name;
    private String username;
    private String adderss;
    private int number;

    public User(int userid, String name, String username, String adderss, int number) {
        this.userid = userid;
        this.name = name;
        this.username = username;
        this.adderss = adderss;
        this.number = number;
    }

    public User() {

    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", adderss='" + adderss + '\'' +
                ", number=" + number +
                '}';
    }
}
