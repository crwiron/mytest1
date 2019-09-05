package com.crw.ssm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Collection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SsmApplicationTests {
    @Autowired
    DataSource dataSource;
    @Test
    public void connect() throws SQLException {
        System.out.println(dataSource.getClass());
    }

    @Test
    public void contextLoads() {
    }

}
