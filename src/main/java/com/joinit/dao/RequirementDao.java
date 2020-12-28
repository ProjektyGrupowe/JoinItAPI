package com.joinit.dao;

import com.joinit.model.Requirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "requirements")
public interface RequirementDao extends JpaRepository<Requirement, Long> {
}
