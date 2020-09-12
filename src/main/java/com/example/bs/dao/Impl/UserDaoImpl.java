package com.example.bs.dao.Impl;

import com.example.bs.dao.UserDao;
import com.example.bs.entity.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {


    /**
     * 普通数据的注入
     */
    private String username;
    private int age;


    /**
     * 集合数据注入
     */
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl(){
        System.out.println("对象创建。。。。");
    }

    public void init(){
        System.out.println("初始化");
    }

    public void destory(){
        System.out.println("初始化");
    }

    @Override
    public void save() {
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running...");
    }
}
