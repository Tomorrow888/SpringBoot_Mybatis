package com.qlu.mybatis.mapper;

import com.qlu.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author jiajinshuo
 * @create 2020-02-11 18:04
 */
//不管是注解还是xml，都应该用@mapper 或@MapperScan将接口扫描装配到容器中
    @Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
