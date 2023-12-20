package com.pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        /* you can also get this by putting in the String name of the class. so:
        Product product = context.getBean("product");                   these 2 are
        Product product = context.getBean(Product.class);                   the same

*/
        Product product = null;     // check if the bean exists before getting it
        // these Beans have the same class type, which is why it's needed to have the name as well
        // as the class type
        if (context.containsBean("pepsi")) {
            product = context.getBean("pepsi", Product.class);
        } else if (context.containsBean("coke")) {
            product = context.getBean("coke", Product.class);
        } else {
            product = context.getBean("hotChocolate", Product.class);
        }

    }

}
