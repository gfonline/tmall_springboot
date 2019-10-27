package com.gfonline.tmall.service;

import com.gfonline.tmall.dao.CategoryDao;
import com.gfonline.tmall.pojo.Category;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService  {

    @Autowired
    CategoryDao categoryDao;

    public List<Category> list(){
        return categoryDao.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }


}
