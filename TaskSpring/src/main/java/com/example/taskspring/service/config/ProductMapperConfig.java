package com.example.taskspring.service.config;

import com.example.taskspring.service.mapper.ProductMapper;
import com.example.taskspring.service.mapper.ProductMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductMapperConfig {

    @Bean
    public ProductMapper productMapper() {
        return new ProductMapperImpl();
    }
}
