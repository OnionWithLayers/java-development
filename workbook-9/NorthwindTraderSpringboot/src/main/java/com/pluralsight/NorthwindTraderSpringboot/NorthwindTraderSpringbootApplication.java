package com.pluralsight.NorthwindTraderSpringboot;

import com.pluralsight.NorthwindTraderSpringboot.models.Product;
import com.pluralsight.NorthwindTraderSpringboot.services.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class NorthwindTraderSpringbootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(NorthwindTraderSpringbootApplication.class, args);

    }
}
