package com.practice.react.practicereact.controller;

import com.practice.react.practicereact.dto.Company;
import com.practice.react.practicereact.mapper.CompanyMapper;
import com.practice.react.practicereact.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyMapper companyMapper;
    @Autowired
    CompanyService companyService;

    @GetMapping("")
    public List<Company> getAll() {
        return companyMapper.getAll();
    }

    @GetMapping("/{pid}")
    public Company getById
        (
            @PathVariable("pid") int pid
        ) {
        return companyMapper.getById(pid);
    }


    @PostMapping("")
    public Company post
        (
            @RequestBody Company company
        ) throws Exception {
//        companyMapper.insert(company);
        return companyService.add(company);
    }


}
