package com.example.taskspring.service;

import com.example.taskspring.common.ProductModel;

import java.util.List;

public interface ProductService {

    ProductModel findProductById(Long id);

    ProductModel createProduct(ProductModel productModel);

    ProductModel updateProduct(ProductModel productModel);

    void deleteProduct(Long id);

    List<ProductModel> getAllProducts();
}
