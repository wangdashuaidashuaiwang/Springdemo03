package com.wjt.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //数组类型属性
    private String[] courses;
    //list集合类型属性
    private List<String> list;
    //Map类型属性
    private Map<String, String> map;
    //set类型属性
    private Set<String> set;

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void test(){
        System.out.println(map);
        System.out.println(set);
        System.out.println(list);
        System.out.println(Arrays.toString(courses));
    }

}
