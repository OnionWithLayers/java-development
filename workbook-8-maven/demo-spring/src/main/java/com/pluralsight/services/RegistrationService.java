package com.pluralsight.services;

import com.pluralsight.dao.interfaces.IRegistrationDAO;
import com.pluralsight.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationService {
    private final IRegistrationDAO registrationDAO;

    // using the interface here, not the implementation. And we're not doing 'implements interface' bc we
    // don't want every method, just some of them and we can choose whichever
    @Autowired //autowired lets me inject this wherever w/o needing to make an instance of it
                // links it to the Spring Container and lets it use whatever is in it
    public RegistrationService(IRegistrationDAO registrationDAO) {
        this.registrationDAO = registrationDAO;
    }

    // this method will check for a student. if it cannot find the ID, it will register them as a new student
    public Long registerStudent(Student student) throws StudentAlreadyRegisteredException {
        if (this.registrationDAO.findById(student.getId()) != null) {
            throw new StudentAlreadyRegisteredException();
        }
        return registrationDAO.persistStudent(student);
    }

}
