package com.wjt;

public class Orders {
    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void tsOrder(){
        System.out.println(oname + " " + address);
    }
}
