package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void accelerate_should_increaseCarSpeed(){ //the class in test should usually describe what specifically you're testing
        //arrange
        Car car = new Car("Ford", "F150 Raptor");
        //speed youre changing
        int speedChange = 15;
        // new variable showing the speed i expect
        int expectedSpeed = 15;

        //act
        // actually using the method
        car.accelerate(speedChange);

        //assert
        //check what the car speed is now after the act
        int actualSpeed = car.getSpeed();
        //checking if the actual speed is the expected speed
        assertEquals(expectedSpeed, actualSpeed);

    }


    @Test
    public void brake_should_decreaseCarSpeed(){
        //arrange
        Car vroom = new Car("Lightning", "McQueen");
        //accelerate by speedUp to get the car moving first
        int speedUp = 15;
        vroom.accelerate(speedUp);
        //what I want to slow down by
        int slowDownBy = 10;
        //what I expect the speed to be
        int expectedSpeed = 5;

        //act
        vroom.brake(slowDownBy);

        //assert
        //get the new speed
        int newSpeed = vroom.getSpeed();
        assertEquals(expectedSpeed, newSpeed);
    }

    @Test
    public void brake_should_stopCar_whenChangeIsGreaterThanSpeed(){
        //arrange
        Car car = new Car("Honda", "Civic");
        int speedUp = 20;
        car.accelerate(speedUp);
        int slowDown = 25;
        int expectedSpeed = 0;
        //act
        car.brake(slowDown);
        //assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }
}