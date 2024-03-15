package com.shoesstore.shoesstore.service.impl;

import com.shoesstore.shoesstore.entity.PostCategories;
import com.shoesstore.shoesstore.entity.Posts;

import java.util.List;
import java.util.Optional;

public interface PostCategoryService {
    List<PostCategories> getAllPostCat();

    void savePostCat(PostCategories Post);

    void deletePostCat(int id);

    Optional<PostCategories> findPostCatById(int id);
}
