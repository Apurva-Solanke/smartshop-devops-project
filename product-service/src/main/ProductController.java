package com.example.product.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public String getProduct() {
        return "products fetched successfully!";
    }

    @PostMapping
    public String createProduct() {
        return "product created!";
    }
}