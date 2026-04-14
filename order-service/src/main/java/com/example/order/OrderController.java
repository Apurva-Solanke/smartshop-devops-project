package com.example.order.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping
    public String getOrders() {
        return "Order fetched successfully!";
    }

    @PostMapping
    public String createOrder() {
        return "Order created!";
    }
}