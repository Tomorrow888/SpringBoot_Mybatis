package com.qlu.mybatis.mapper;

import com.qlu.mybatis.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author jiajinshuo
 * @create 2020-02-11 17:21
 */
//指定这是一个操作数据库的mapper
@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id =#{id}")
    public Department getDepById(Integer id);

    @Delete("delete from department where id = #{id}")
    public int deleteDepById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName}) ")
    public int insertDept(Department department);

    @Update("update department set departmentName =#{departmentName} where id = #{id}")
    public int updateDept(Department department);
}
