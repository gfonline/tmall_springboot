package com.gfonline.tmall.web;

import com.gfonline.tmall.pojo.Category;
import com.gfonline.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    public List<Category> list () throws Exception{
        return categoryService.list();
    }
}
