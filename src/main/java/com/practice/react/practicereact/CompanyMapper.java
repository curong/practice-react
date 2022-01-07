package com.practice.react.practicereact;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CompanyMapper {

    @Insert("INSERT INTO company(company_name, company_address) VALUES(#{company.name}, #{company.address})")
    @Options(useGeneratedKeys = true, keyProperty = "pid")
    int insert(@Param("company") Company company);

    @Select("SELECT * FROM company")
    @Results(id = "CompanyMap", value = {
        @Result(property = "pid", column = "pid"),
        @Result(property = "name", column = "company_name"),
        @Result(property = "address", column = "company_address"),
        @Result(property = "employeeList", column = "pid", many = @Many(select="com.practice.react.practicereact.EmployeeMapper.getByCompanyPid"))
    })
    List<Company> getAll();

    @Select("SELECT * FROM company WHERE pid=#{pid}")
    @ResultMap("CompanyMap")
    Company getById(@Param("pid") int pid);
}
