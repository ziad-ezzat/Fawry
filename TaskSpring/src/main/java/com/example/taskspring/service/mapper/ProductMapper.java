package com.example.taskspring.service.mapper;

import com.example.taskspring.common.ProductModel;
import org.mapstruct.*;
import com.example.taskspring.repository.entity.Product;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product productModelToProduct(ProductModel productModel);

    ProductModel productToProductModel(Product product);
}
