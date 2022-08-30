package com.wjt;

/*
 * 演示使用set方法进行注入
 * */

public class Book {
    private String bname;
    private String author;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
    public void testBook(){
        System.out.println(bname + "::" +author + "::" + address);
    }

}
