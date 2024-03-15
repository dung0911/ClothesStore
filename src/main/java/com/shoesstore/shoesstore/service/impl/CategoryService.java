package com.shoesstore.shoesstore.service.impl;

import com.shoesstore.shoesstore.entity.Categories;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Categories> getAllCategory();

    void saveCategory(Categories Category);

    void deleteCategory(int id);

    Optional<Categories> findCategoryById(int id);
}
