package com.shoesstore.shoesstore.repository;

import com.shoesstore.shoesstore.entity.PostCategories;
import com.shoesstore.shoesstore.entity.Posts;
import org.springframework.data.repository.CrudRepository;

public interface PostCategoryRepository extends CrudRepository<PostCategories, Integer> {
}
