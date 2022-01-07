package com.practice.react.practicereact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("")
    public List<Employee> getAll() {
        return employeeMapper.getAll();
    }

    @GetMapping("/{pid}")
    public Employee getById
        (
            @PathVariable("pid") int pid
        ) {
        return employeeMapper.getById(pid);
    }


    @PostMapping("")
    public Employee post
        (
            @RequestBody Employee employee
        ) {
        employeeMapper.insert(employee);
        return employee;
    }

}
