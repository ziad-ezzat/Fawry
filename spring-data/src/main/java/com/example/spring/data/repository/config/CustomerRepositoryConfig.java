package com.example.spring.data.repository.config;

import com.example.spring.data.repository.CustomerRepository;
import com.example.spring.data.repository.entity.Customer;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackageClasses = Customer.class)
@EnableJpaRepositories(basePackageClasses = CustomerRepository.class)
public class CustomerRepositoryConfig {
}
