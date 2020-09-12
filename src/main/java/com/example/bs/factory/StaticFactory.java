package com.example.bs.factory;

import com.example.bs.dao.Impl.UserDaoImpl;
import com.example.bs.dao.UserDao;

/**
 * bean的静态工厂实例化
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
