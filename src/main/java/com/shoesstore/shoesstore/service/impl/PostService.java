package com.shoesstore.shoesstore.service.impl;

import com.shoesstore.shoesstore.entity.Posts;

import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Posts> getAllPost();

    void savePost(Posts Post);

    void deletePost(int id);

    Optional<Posts> findPostById(int id);
}
