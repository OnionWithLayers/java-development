package com.pluralsight;

import com.pluralsight.models.Student;
import com.pluralsight.services.RegistrationService;
import com.pluralsight.services.StudentAlreadyRegisteredException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws StudentAlreadyRegisteredException {

        //this makes it so that it will check within the place specified in beans.xml for methods
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/beans.xml");
   /*   with this i dont need to worry ab making a DAO and connecting everything. Spring will do it for me with
        this. This also makes it so that if there's an error in one class, it wont prevent the entire program from
        not running  */
        RegistrationService registrationService = ctx.getBean(RegistrationService.class);

        Long studentID = registrationService.registerStudent(new Student("Alan", "Turing", "Computer Science"));
        System.out.println("Student Registered with ID: " + studentID);

        Long studentID2 = registrationService.registerStudent(new Student("Johannes", "Kepler", "Astronomy"));
        System.out.println("Student Registered with ID: " + studentID2);
    }
}