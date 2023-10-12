package com.pluralsight;

public class Car {
    package com.pluralsight;

    public class Car {
        private String color;
        private int year;
        private String make;
        private String model;
        private double odometer;
        private int speed;

        public Car(String color, int year, String make, String model, double odometer) {
            this.color = color;
            this.year = year;
            this.make = make;
            this.model = model;
            this.odometer = odometer;
            this.speed = 0;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getOdometer() {
            return odometer;
        }

        public void setOdometer(double odometer) {
            this.odometer = odometer;
        }

        public int getSpeed() {
            return speed;
        }

        public void accelerate(int){
            this.speed += 15;
        }

        public void accelerate(int extraSpeed) {
            this.speed += extraSpeed; //this.speed = this.speed + extraSpeed
        }

        public void brake(int minusSpeed) {
            if (this.speed - minusSpeed > 0) {
                this.speed -= minusSpeed;
            } else {
                this.speed = 0;
            }
        }

    }
}
