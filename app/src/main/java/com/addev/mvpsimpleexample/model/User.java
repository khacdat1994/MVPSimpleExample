package com.addev.mvpsimpleexample.model;

public class User {
    public String uname;
    public String pwd;

    public User(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public User() {
    }

    public boolean login() {
        if (uname.equals("admin") && pwd.equals("admin")) {
            return true;
        }
        return false;
    }
}
