package com.joinit.controller;

import com.joinit.dao.CompanyDao;
import com.joinit.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "/company")
public class CompanyController {

    @Autowired
    private CompanyDao companyDao;

    @PostMapping("/create")
    public Company createCompanyUser(@RequestBody Company company){
        return companyDao.save(company);
    }
}
