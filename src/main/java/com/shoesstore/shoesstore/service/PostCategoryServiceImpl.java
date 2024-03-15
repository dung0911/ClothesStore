package com.shoesstore.shoesstore.service;

import com.shoesstore.shoesstore.entity.PostCategories;
import com.shoesstore.shoesstore.repository.PostCategoryRepository;
import com.shoesstore.shoesstore.service.impl.PostCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostCategoryServiceImpl implements PostCategoryService {
    @Autowired
    private PostCategoryRepository postCategoryRepository;

    @Override
    public List<PostCategories> getAllPostCat() {
        return (List<PostCategories>) postCategoryRepository.findAll();
    }

    @Override
    public void savePostCat(PostCategories Post) {
        postCategoryRepository.save(Post);
    }

    @Override
    public void deletePostCat(int id) {
        postCategoryRepository.deleteById(id);
    }

    @Override
    public Optional<PostCategories> findPostCatById(int id) {
        return postCategoryRepository.findById(id);
    }
}
