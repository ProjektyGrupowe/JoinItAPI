package com.joinit.dao;

import com.joinit.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "companies")
public interface CompanyDao extends JpaRepository<Company, String> {
}
