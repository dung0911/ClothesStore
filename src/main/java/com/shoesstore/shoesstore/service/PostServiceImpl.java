package com.shoesstore.shoesstore.service;

import com.shoesstore.shoesstore.entity.Posts;
import com.shoesstore.shoesstore.repository.PostRepository;
import com.shoesstore.shoesstore.service.impl.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Posts> getAllPost() {
        return (List<Posts>) postRepository.findAll();
    }

    @Override
    public void savePost(Posts Post) {
        postRepository.save(Post);
    }

    @Override
    public void deletePost(int id) {
        postRepository.deleteById(id);
    }

    @Override
    public Optional<Posts> findPostById(int id) {
        return postRepository.findById(id);
    }
}
