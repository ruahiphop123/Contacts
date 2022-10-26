package com.example.contactdemo;

import java.io.Serializable;

public class ContactsClass implements Serializable {
    String name;
    String sdt;

    public ContactsClass() {
    }

    public ContactsClass(String name, String sdt) {
        this.name = name;
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
