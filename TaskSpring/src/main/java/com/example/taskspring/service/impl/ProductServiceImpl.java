package com.example.taskspring.service.impl;

import com.example.taskspring.common.ProductModel;
import com.example.taskspring.repository.ProductRepo;
import com.example.taskspring.entities.Product;
import com.example.taskspring.service.ProductService;
import com.example.taskspring.service.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Primary
@Lazy
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo, ProductMapper productMapper) {
        this.productRepo = productRepo;
        this.productMapper = productMapper;
        // for test lazy loading
        System.out.println("ProductServiceImpl");
    }


    @Override
    public ProductModel findProductById(Long id) {
        return productMapper.productToProductModel(productRepo.findById(id).orElse(null));
    }

    @Override
    public ProductModel createProduct(ProductModel productModel) {
        Product product = productMapper.productModelToProduct(productModel);
        return productMapper.productToProductModel(productRepo.save(product));
    }

    @Override
    public ProductModel updateProduct(ProductModel productModel) {
        Product product = productMapper.productModelToProduct(productModel);
        return productMapper.productToProductModel(productRepo.save(product));
    }

    @Override
    public void deleteProduct(Long id) {
        productRepo.findById(id).ifPresent(product -> productRepo.delete(product));
    }

    @Override
    public List<ProductModel> getAllProducts() {
        return productRepo
                .findAll()
                .stream()
                .map(productMapper::productToProductModel)
                .collect(java.util.stream.Collectors.toList());
    }
}
