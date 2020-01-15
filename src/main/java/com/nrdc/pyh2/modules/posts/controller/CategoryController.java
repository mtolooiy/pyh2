package com.nrdc.pyh2.modules.posts.controller;

import com.nrdc.pyh2.modules.posts.model.Categories;
import com.nrdc.pyh2.modules.posts.model.Posts;
import com.nrdc.pyh2.modules.posts.service.CategoryService;
import com.nrdc.pyh2.modules.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = {"/",""}, method = RequestMethod.GET)
    public List<Categories> getCategories() {
        return categoryService.findAllCategories();
    }

    @RequestMapping(value = {"/",""}, method = RequestMethod.POST)
    public Categories registerCategory(@RequestBody Categories category) {
        return categoryService.registerCategory(category);
    }


}
