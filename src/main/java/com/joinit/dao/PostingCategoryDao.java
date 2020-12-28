package com.joinit.dao;

import com.joinit.model.PostingCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "posting-categories")
public interface PostingCategoryDao extends JpaRepository<PostingCategory, Long> {
}
