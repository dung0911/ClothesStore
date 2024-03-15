package com.shoesstore.shoesstore.service;

import com.shoesstore.shoesstore.entity.Products;
import com.shoesstore.shoesstore.repository.ProductRepository;
import com.shoesstore.shoesstore.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Products> getAllProduct() {
        return (List<Products>) productRepository.findAll();
    }

    @Override
    public void saveProduct(Products Product) {
        productRepository.save(Product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Products> findProductById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Products> findByProductName(String name) {
        return productRepository.findByProductName(name);
    }

    @Override
    public List<Products> findAllProAsc() {
        return productRepository.findAllProAsc();
    }

    @Override
    public List<Products> findAllProDesc() {
        return productRepository.findAllProDesc();
    }
}
