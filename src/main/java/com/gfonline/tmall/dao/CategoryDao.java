package com.gfonline.tmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gfonline.tmall.pojo.Category;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
