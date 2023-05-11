package com.onefiter.newbeemall;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class NewbeeMallApplicationTests {

    // 注入数据源对象
    private DataSource defaultDataSource;
    @Test
    public void datasourceTest() throws SQLException {
        // 获取数据库连接对象
        Connection connection = defaultDataSource.getConnection();
        System.out.print("获取连接：");
        // 判断连接对象是否为空
        System.out.println(connection != null);
        connection.close();
    }
    @Test
    void contextLoads() {
    }

}
