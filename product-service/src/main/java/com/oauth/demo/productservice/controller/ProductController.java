package com.oauth.demo.productservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {

    /**
     * Get sample product.
     * 
     * @return - Sample product.
     */
    @GetMapping(path = "/product")
    @ResponseBody
    public Map<String, String> getProduct() {
        Map<String, String> productResponse = new HashMap<>();

        productResponse.put("name", "product 1");
        productResponse.put("product_id", "009");

        return productResponse;
    }
}
