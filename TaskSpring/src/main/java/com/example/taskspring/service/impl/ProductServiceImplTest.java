package com.example.taskspring.service.impl;

import com.example.taskspring.common.ProductModel;
import com.example.taskspring.repository.ProductRepo;
import com.example.taskspring.service.ProductService;
import com.example.taskspring.service.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Lazy
//this class for test lazy loading
public class ProductServiceImplTest implements ProductService {

    private final ProductRepo productRepo;

    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImplTest(ProductRepo productRepo, ProductMapper productMapper) {
        this.productRepo = productRepo;
        this.productMapper = productMapper;
        // for test lazy loading
        System.out.println("ProductServiceImplTest");
    }

    @Override
    public ProductModel findProductById(Long id) {
        return null;
    }

    @Override
    public ProductModel createProduct(ProductModel productModel) {
        return null;
    }

    @Override
    public ProductModel updateProduct(ProductModel productModel) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public List<ProductModel> getAllProducts() {
        return null;
    }
}
