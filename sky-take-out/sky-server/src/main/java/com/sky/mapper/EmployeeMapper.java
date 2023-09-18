package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    // 添加员工
    @AutoFill(value = OperationType.INSERT)
    void insert(Employee employee);

    //员工信息分页带条件查询
    Page<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 根据主键动态修改属性
     * @param employee:
     * @return void
     */
    @AutoFill(OperationType.UPDATE)
    void update(Employee employee);

    /**
     * 根据id查询员工信息
     * @param id:
     * @return Employee
     */
    @Select("select * from employee where id = #{id}")
    Employee getById(Long id);
}
