package com.nrdc.pyh2.modules.posts.repository;

import com.nrdc.pyh2.modules.posts.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Categories, Long> {

}

