package com.wjt;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void test1() {
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();

    }
    @Test
    public void testBook() {
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book.getBname()+ "::" + book.getAuthor()+"::" + book.getAddress());


        book.testBook();
    }
    @Test
    public void testOrders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Orders orders = context.getBean("orders", Orders.class);

        orders.tsOrder();
    }


}
