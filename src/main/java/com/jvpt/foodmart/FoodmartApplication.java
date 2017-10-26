package com.jvpt.foodmart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class FoodmartApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodmartApplication.class, args);
	}
}
