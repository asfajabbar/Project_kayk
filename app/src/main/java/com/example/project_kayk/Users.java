package com.example.project_kayk;

public class Users {
    public String username;
    public String phone;
    public String email;
    private  String feedback;


    public Users(String username, String phone, String email) {
        this.username = username;
        this.phone = phone;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    public void setUsername(String username) {
        this.username = username;
    }


}
