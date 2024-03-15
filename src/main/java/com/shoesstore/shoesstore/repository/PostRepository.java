package com.shoesstore.shoesstore.repository;

import com.shoesstore.shoesstore.entity.Posts;
import com.shoesstore.shoesstore.entity.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Posts, Integer> {
}
