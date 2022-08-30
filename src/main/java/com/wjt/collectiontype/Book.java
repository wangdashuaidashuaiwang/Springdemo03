package com.wjt.collectiontype;

import java.util.List;

public class Book {
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
    public  void tsBook(){
        System.out.println(list);
    }
}
