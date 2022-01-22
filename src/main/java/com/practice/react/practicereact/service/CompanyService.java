package com.practice.react.practicereact.service;

import com.practice.react.practicereact.dto.Company;
import com.practice.react.practicereact.mapper.CompanyMapper;
import com.practice.react.practicereact.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    public List<Company> getAll() {
        List<Company> companyList = companyMapper.getAll();
        if (companyList != null && companyList.size() > 0) {
            for (Company company : companyList) {
                company.setEmployeeList(employeeMapper.getByCompanyPid(company.getPid()));
            }
        }
        return companyList;
    }

    @Transactional(rollbackFor = Exception.class)
    public Company add(Company company) throws Exception {
        companyMapper.insert(company);
        // [2022-01-08 : 오전 2:58] [재우] - add company into legacy system
        if (true) {
            throw new Exception("Legacy Exception");
        }
        return company;
    }


}
