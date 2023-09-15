package com.example.spring.data.rest.config;

import com.example.spring.data.rest.CustomerResource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CustomerResource.class})
public class CustomerRestConfig {
}
