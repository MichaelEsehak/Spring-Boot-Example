/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.michael.sb.service.impl;

import com.michael.sb.entity.Company;
import com.michael.sb.repo.CompanyRepo;
import com.michael.sb.service.CompanyService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Michael
 */
@Service("companyService")
public class SimpleCompanyService extends SimpleAbstractService<Company> implements CompanyService {

//    @Autowired
//    private CompanyRepo companyRepo;

    @Override
    public CompanyRepo getRepo() {
        return null;
    }

    
}
