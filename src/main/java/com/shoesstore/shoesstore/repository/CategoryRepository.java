package com.shoesstore.shoesstore.repository;

import com.shoesstore.shoesstore.entity.Categories;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Categories, Integer> {
}
