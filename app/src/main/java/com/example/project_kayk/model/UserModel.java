package com.example.project_kayk.model;

public class UserModel {

    String UserName;

    public UserModel(String userName) {
        UserName = userName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
