package com.pluralsight.dao.impl;

import com.pluralsight.dao.interfaces.IRegistrationDAO;
import com.pluralsight.models.Student;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component //this class is now a Spring Bean bc the '@Component' made it a component of the Spring Container
           // bc this is a Spring Bean, I don't have to worry ab making an instance of this to use it, I can
           // just inject it
public class SimpleRegistrationDAO implements IRegistrationDAO {
    private HashMap<Long, Student> hashMap;
    private Long counter = 60L;

    public SimpleRegistrationDAO() {
        this.hashMap = new HashMap<Long, Student>();
        this.hashMap.put(10L, new Student(10L, "Marie", "Curie", "Science"));
        this.hashMap.put(22L, new Student(22L, "Albert", "Einstein", "Science"));
        this.hashMap.put(44L, new Student(44L, "Niels", "Bohr", "Science"));
        this.hashMap.put(54L, new Student(54L, "Carl", "Jung", "Psychology"));
    }

    @Override //the @Override is needed bc it's using a method from an Interface
    public Long persistStudent(Student student) {
        long freshId = counter++;
        this.hashMap.put(freshId,
                new Student(freshId, student.getFirstName(),
                        student.getLastName(),
                        student.getMajor()));
        return freshId;
    }

    @Override
    public Student findById(Long id) {
        return hashMap.get(id);
    }
}
