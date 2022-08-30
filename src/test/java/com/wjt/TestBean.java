package com.wjt;

import com.wjt.bean.Emp;
import com.wjt.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void test1() {
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();

    }
    @Test
    public void testEmp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.testPrintsth();

    }



}
