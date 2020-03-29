package com.qlu.mybatis;

import com.qlu.mybatis.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper1;
    @Test
    void contextLoads() {
        System.out.println(employeeMapper1);
    }

}
