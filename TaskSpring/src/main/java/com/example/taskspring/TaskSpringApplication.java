package com.example.taskspring;

import com.example.taskspring.repository.config.ProductRepoConfig;
import com.example.taskspring.rest.config.ProductRestConfig;
import com.example.taskspring.service.config.ProductServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Import({ProductRepoConfig.class,
         ProductServiceConfig.class,
         ProductRestConfig.class
        })
public class TaskSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskSpringApplication.class, args);
    }
}
