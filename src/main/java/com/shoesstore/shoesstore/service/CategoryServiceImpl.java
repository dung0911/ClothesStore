package com.shoesstore.shoesstore.service;

import com.shoesstore.shoesstore.entity.Categories;
import com.shoesstore.shoesstore.entity.Products;
import com.shoesstore.shoesstore.repository.CategoryRepository;
import com.shoesstore.shoesstore.repository.ProductRepository;
import com.shoesstore.shoesstore.service.impl.CategoryService;
import com.shoesstore.shoesstore.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Categories> getAllCategory() {
        return (List<Categories>) categoryRepository.findAll();
    }

    @Override
    public void saveCategory(Categories Category) {
        categoryRepository.save(Category);
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Optional<Categories> findCategoryById(int id) {
        return categoryRepository.findById(id);
    }
}
