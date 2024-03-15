package com.shoesstore.shoesstore.service.impl;

import com.shoesstore.shoesstore.entity.Products;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Products> getAllProduct();

    void saveProduct(Products Product);

    void deleteProduct(int id);

    Optional<Products> findProductById(int id);

    List<Products> findByProductName(String name);

    List<Products> findAllProAsc();

    List<Products> findAllProDesc();
}
