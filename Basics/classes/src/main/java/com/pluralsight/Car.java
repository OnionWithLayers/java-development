package com.pluralsight;

public class Car { /*this is a class that I just made. With this, I'm not restricted with
        basic classes like String, double, int, etc
*/
    private String color;
    private int year;
    private String make;
    private String model;
    private double odometer;

     /* this code is what we started off learning ab. we dont use this anymore
     the proper way to code is below that

   public Car(String colorFromTheUser, int yearFromTheUser, String makeFromTheUser,
               String modelFromTheUser, double odometerFromTheUser){
        this.color = colorFromTheUser;
        this.year = yearFromTheUser;
        this.make = makeFromTheUser;
        this.model = modelFromTheUser;
        this.odometer = odometerFromTheUser;

   the code below is the proper way to code. you dont need "fromTheUser", just leave the name the
   same, and to avoid confusing java, use the syntax "this." in front of the variable to refer
   to the class mentioned/defined earlier in the code above.
   the stand-alone name is now what the user inputs
    */

    public Car(String color, int year, String make, //this is called a constructor
               String model, double odometer) {
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
        this.odometer = odometer;
    }

    /* to gain access to the specific attribute, we make a new public method to call
        the private method,
        and since the new method is public, we could use it.
        basically we need to make a middle-man
        this is called a "getter"
         */
    public String getColor(){
        return this.color;
    }

/*now if we wanna use a diff color, this updates it using the "set" in "setColor",
so now the attribute "this.color" which was red, is changed to the new "color" which
is now blue, thanks to the method in the main method in the other page, " new.Car.setColor("Blue"); "
this is called a "setter"
    * */
    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return this.year;
    }
}
