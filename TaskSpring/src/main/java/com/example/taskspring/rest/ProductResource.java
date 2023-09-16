package com.example.taskspring.rest;

import com.example.taskspring.common.ProductModel;
import com.example.taskspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    List<ProductModel> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    ProductModel getProductById(@PathVariable("id") Long id) {
        return productService.findProductById(id);
    }

    @DeleteMapping("{id}")
    void deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
    }

    @PostMapping
    ProductModel createProduct(@RequestBody ProductModel productModel) {
        return productService.createProduct(productModel);
    }

    @PutMapping
    ProductModel updateProduct(@RequestBody ProductModel productModel) {
        return productService.updateProduct(productModel);
    }
}
