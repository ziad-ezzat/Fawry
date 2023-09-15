package com.example.taskspring.service.config;

import com.example.taskspring.service.ProductService;
import com.example.taskspring.service.mapper.ProductMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {ProductMapper.class, ProductService.class})
public class ProductServiceConfig {
}
