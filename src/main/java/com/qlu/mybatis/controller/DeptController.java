package com.qlu.mybatis.controller;

import com.qlu.mybatis.bean.Department;
import com.qlu.mybatis.bean.Employee;
import com.qlu.mybatis.mapper.DepartmentMapper;
import com.qlu.mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiajinshuo
 * @create 2020-02-11 17:37
 */
@RestController
public class DeptController {
    @Autowired(required = false)
    DepartmentMapper departmentMapper;
    @Autowired(required = false)
    EmployeeMapper employeeMapper;

    @GetMapping("dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        Department department = departmentMapper.getDepById(id);
        return department;

    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;

    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }
}
