package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchIn_StartTimeNotSet_ChangesStartTimeSetToGivenTime(){
        //arrange
        Employee employee = new Employee(1, "Finn", "Help Desk",);
        double expectedTime = 9.0;
        //act
        employee.punchIn(9);
        //assert
        double actualTime = employee.getStartTime();
        assertEquals(expectedTime, actualTime);
    }
}