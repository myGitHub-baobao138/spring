package com.example.bs;

import com.example.bs.dao.UserDao;
import com.example.bs.service.UserService;
import com.example.bs.serviceImpl.UserServiceImpl;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootTest
class BsApplicationTests {

    /**
     * 测试bean的scope属性----singleton----prototype
     *
     * singleton 获取两个bean对象的地址相同
     * prototype 获取两个bean对象的地址不同
     * 区别：
     * singleton会在加载配置文件的时候就创建一个bean
     * prototype只有当需要这个bean对象的时候才会创建一个bean
     */
    @Test
    void contextLoads() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        System.out.println(userDao);
    }


    /**
     * 测试依赖出入
     */
    @Test
    void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.save();
    }

    /**
     * 会报错空指针，因为下面这个userService不是从容器中拿的对象，userService里面没有userDao对象
     */
    @Test
    void test2() {
        UserService userService = new UserServiceImpl();
        userService.save();
    }

}
