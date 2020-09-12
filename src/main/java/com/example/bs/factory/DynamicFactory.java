package com.example.bs.factory;

import com.example.bs.dao.Impl.UserDaoImpl;
import com.example.bs.dao.UserDao;

/**
 * 工厂实例化方法创建bean
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
