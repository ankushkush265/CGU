package com.db.lmassb.dataModel.Login;

import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("id")
    public String id;
    public String name;
    public String mobile;
    public String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.email = email;
    }
}

