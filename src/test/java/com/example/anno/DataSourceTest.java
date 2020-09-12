package com.example.anno;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DataSourceTest {
    @Test
    /**
     * 手动测试druid数据池
     */
    public void test1() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("baozijiuban");
        DruidPooledConnection connection = dataSource.getConnection();
        connection.close();
    }

    @Test
    /**
     * 手动测试druid数据池--加载配置文件
     * 将数据库配置放到properties里面
     */
    public void test2() throws SQLException {
        //读取配置文件
        ResourceBundle rb = ResourceBundle.getBundle("application");
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");

        //接下来操作和test1一样


    }
    @Test
    /**
     * 测试spring容器创建数据池
     */
    public void test3() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-anno.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        connection.close();

    }
}
