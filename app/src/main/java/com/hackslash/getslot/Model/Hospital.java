package com.hackslash.getslot.Model;

public class Hospital {
    private String name,address,feetype;

    public Hospital(String name, String address, String feetype) {
        this.name = name;
        this.address = address;
        this.feetype = feetype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }
}
