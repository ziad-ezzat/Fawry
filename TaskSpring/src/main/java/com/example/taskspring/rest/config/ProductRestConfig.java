package com.example.taskspring.rest.config;

import com.example.taskspring.rest.ProductResource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {ProductResource.class})
public class ProductRestConfig {
}
