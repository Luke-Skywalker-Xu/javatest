package com.xuxiaolan.java.day5.school;

public class Person {
    private String name;
    private String address;

    private int tel;
    private String email;

    //构造方法
    public Person(String name, String address, int tel, String email) {
        this.setName(name);
        this.setAddress(address);
        this.setTel(tel);
        this.setEmail(email);
    }

    public Person() {

    }

    //输出方法
    public String getInfo() {
        return "名字:" + this.getName() + "\n" +
                "地址:" + this.getAddress() + "\n" +
                "手机号:" + this.getTel() + "\n" +
                "邮箱:" + this.getEmail();
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

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}









