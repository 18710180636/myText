package com.qmvb.model;

/**
 * Created by Administrator on 2016/12/29.
 */
public class Customer {
    private long id;
    private String name;
    private String contact;
    private String tetephone;
    private String email;
    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTetephone() {
        return tetephone;
    }

    public void setTetephone(String tetephone) {
        this.tetephone = tetephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
