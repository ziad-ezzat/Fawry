package com.example.taskspring.repository.config;

import com.example.taskspring.repository.ProductRepo;
import com.example.taskspring.repository.entity.Product;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackageClasses = Product.class)
@EnableJpaRepositories(basePackageClasses = ProductRepo.class)
public class ProductRepoConfig {
}
