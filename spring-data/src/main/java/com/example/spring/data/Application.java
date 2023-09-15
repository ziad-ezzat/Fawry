package com.example.spring.data;

import com.example.spring.data.repository.config.CustomerRepositoryConfig;
import com.example.spring.data.rest.config.CustomerRestConfig;
import com.example.spring.data.service.config.CustomerServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({
		CustomerRepositoryConfig.class,
		CustomerServiceConfig.class,
		CustomerRestConfig.class
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
