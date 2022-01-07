package com.practice.react.practicereact;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {



    @Insert("INSERT INTO employee(company_pid ,employee_name, employee_address) VALUES(#{employee.companyPid},#{employee.name}, #{employee.address})")
    @Options(useGeneratedKeys = true, keyProperty = "pid")
    int insert(@Param("employee") Employee employee);

    @Select("SELECT * FROM employee")
    @Results(id = "EmployeeMap", value = {
        @Result(property = "pid", column = "pid"),
        @Result(property = "companyPid", column = "company_pid"),
        @Result(property = "name", column = "employee_name"),
        @Result(property = "address", column = "employee_address"),
    })
    List<Employee> getAll();

    @Select("SELECT * FROM employee WHERE pid=#{pid}")
    @ResultMap("EmployeeMap")
    Employee getById(@Param("pid") int pid);

    @Select("SELECT * FROM employee where pid=#{companyPid}")
    @ResultMap("EmployeeMap")
    List<Employee> getByCompanyPid(@Param("companyPid") int companyPid);

}
