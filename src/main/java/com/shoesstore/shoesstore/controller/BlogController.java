package com.shoesstore.shoesstore.controller;

import com.shoesstore.shoesstore.entity.PostCategories;
import com.shoesstore.shoesstore.entity.Posts;
import com.shoesstore.shoesstore.entity.Products;
import com.shoesstore.shoesstore.service.impl.PostCategoryService;
import com.shoesstore.shoesstore.service.impl.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private PostService postService;

    @Autowired
    private PostCategoryService postCategoryService;

    @RequestMapping("/post")
    public String Post(Model model) {
        List<Posts> lstPost = postService.getAllPost();
        List<PostCategories> lstPostCat = postCategoryService.getAllPostCat();
        model.addAttribute("lstPost", lstPost);
        model.addAttribute("lstPostCat", lstPost);
        return "/Page/Views/Post/post";
    }

    @RequestMapping(value = "/PostDetail", method = RequestMethod.GET)
    public String viewPostDetail(@RequestParam("id") int postID, Model model) {
        Optional<Posts> productDetail = postService.findPostById(postID);
        productDetail.ifPresent(p -> model.addAttribute("post", p));
        return "/Page/Views/Post/postDetail";
    }

}
