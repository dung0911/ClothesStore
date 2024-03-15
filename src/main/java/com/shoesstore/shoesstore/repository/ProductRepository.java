package com.shoesstore.shoesstore.repository;

import com.shoesstore.shoesstore.entity.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Products, Integer> {
    List<Products> findAllPro();

    List<Products> findByProductName(String productName);

    List<Products> findAllProAsc();

    List<Products> findAllProDesc();
}
