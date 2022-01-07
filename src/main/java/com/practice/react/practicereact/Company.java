package com.practice.react.practicereact;

import java.util.List;

public class Company {
    private int pid;
    private String name;
    private String address;
    private List<Employee> employeeList;

    public Company() {
    }

    public Company(int pid, String name, String address) {
        this.pid = pid;
        this.name = name;
        this.address = address;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Company(int pid, String name, String address, List<Employee> employeeList) {
        this.pid = pid;
        this.name = name;
        this.address = address;
        this.employeeList = employeeList;
    }
}