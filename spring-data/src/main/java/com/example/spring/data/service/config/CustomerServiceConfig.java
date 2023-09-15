package com.example.spring.data.service.config;

import com.example.spring.data.service.CustomerService;
import com.example.spring.data.service.mapper.CustomerMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CustomerService.class,  CustomerMapper.class})
public class CustomerServiceConfig {
}
