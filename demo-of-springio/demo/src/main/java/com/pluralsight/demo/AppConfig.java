package com.pluralsight.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Product product(){
        return new Product(55, "Hot Chocolate", "Beverages", 2.50);
    }
    @Bean
    public Product coke(){
        return new Product(56, "Coke", "Beverages", 1);
    }
    /* if there are 2 beans with the same class type, you cannot call on it using the:
    Product product = context.getBean(Product.class);   method. this is bc Spring doesn't know which
    of the two to use.
    */
}
