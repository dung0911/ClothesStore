package com.shoesstore.shoesstore.repository;

import com.shoesstore.shoesstore.entity.Categories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Categories, Integer> {
    @Query(name = "Categories.findChildCategories")
    List<Categories> findChildCategories(@Param("parentId") int id);

    @Query(name = "Categories.findParentCategories")
    List<Categories> findParentCategories();
}
