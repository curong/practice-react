package com.practice.react.practicereact;

public class Employee {
    private int pid;
    private int companyPid;
    private String name;
    private String address;

    public Employee() {
    }

    public Employee(int pid, int companyPid, String name, String address) {
        this.pid = pid;
        this.companyPid = companyPid;
        this.name = name;
        this.address = address;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCompanyPid() {
        return companyPid;
    }

    public void setCompanyPid(int companyPid) {
        this.companyPid = companyPid;
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
}