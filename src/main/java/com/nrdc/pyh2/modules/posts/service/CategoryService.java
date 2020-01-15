package com.nrdc.pyh2.modules.posts.service;

import com.nrdc.pyh2.modules.posts.model.Categories;
import com.nrdc.pyh2.modules.posts.repository.CategoryRepository;
import com.nrdc.pyh2.modules.users.model.Users;
import com.nrdc.pyh2.modules.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Categories registerCategory(Categories category) {
        return this.categoryRepository.save(category);
    }

    public List<Categories> findAllCategories() {
        return this.categoryRepository.findAll();
    }


}
