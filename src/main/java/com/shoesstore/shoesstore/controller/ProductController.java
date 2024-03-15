package com.shoesstore.shoesstore.controller;

import com.shoesstore.shoesstore.entity.Categories;
import com.shoesstore.shoesstore.entity.Products;
import com.shoesstore.shoesstore.repository.ProductRepository;
import com.shoesstore.shoesstore.service.impl.CategoryService;
import com.shoesstore.shoesstore.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/")
    public String index(Model model) {
        List<Products> lstProduct = productService.getAllProduct();
        model.addAttribute("lstProduct", lstProduct);
        return "/Page/index";
    }

    @RequestMapping("/shop")
    public String shopProduct(@RequestParam(name = "productName", required = false) String searchKeyword, Model model) {
        List<Products> lstProduct;
        List<Categories> lstCat = categoryService.getAllCategory();
        System.out.println();
        if (searchKeyword != null && !searchKeyword.isEmpty()) {
            lstProduct = productRepository.findByProductName(searchKeyword);
        } else {
            lstProduct = productRepository.findAllPro();
        }
        model.addAttribute("lstProduct", lstProduct);
        model.addAttribute("lstCat", lstCat);
        return "/Page/Views/Shop/shop";
    }

    @RequestMapping(value = "/ProductDetail", method = RequestMethod.GET)
    public String viewProductDetail(@RequestParam("id") int productID, Model model) {
        Optional<Products> productDetail = productService.findProductById(productID);
        productDetail.ifPresent(pro -> model.addAttribute("product", pro));
        return "/Page/Views/Shop/ProductDetail";
    }

    @RequestMapping("/shop/filter")
    public String handleFilterRequest(@RequestParam("optionId") String optionId, Model model) {
        List<Products> lstProduct;
        switch (optionId) {
            case "defaultSorting":
                lstProduct = productRepository.findAllPro();
                break;
            case "bestSelling":
                lstProduct = null;
                break;
            case "alphabeticallyAsc":
                lstProduct = productRepository.findAllProAsc();
                break;
            case "alphabeticallyDesc":
                lstProduct = productRepository.findAllProDesc();
                break;
            case "priceLowToHigh":
                lstProduct = null;
                break;
            case "priceHighToLow":
                lstProduct = null;
                break;
            default:
                lstProduct = productRepository.findAllPro();
                break;
        }
        model.addAttribute("lstProduct", lstProduct);

        return "/Page/Views/Shop/shop";
    }
}
