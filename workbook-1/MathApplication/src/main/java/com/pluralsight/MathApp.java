import java.sql.SQLOutput;

public class MathApp {
    public static void main(String[] args) {
        /*Question/Answer format:
        declare variables here
        then code solution
        then use System.out.println() to display results
        ex: System.out.println("The answer is" + answer);

        REPEAT FOR NEXT EXERCISE */
        double bobSalary = 75_000;
        double garySalary = 88_000;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is $" + highestSalary);

        // car prices now
        double carPrice = 50_000;
        double truckPrice = 55_000;
        double cheaperPrice = Math.min(carPrice, truckPrice);

        System.out.println("The cheaper vehicle price is $" + cheaperPrice);

        //area of circle whose radius is 7.25
        double circleRadius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(circleRadius, 2);
        System.out.println("the area of a circle whose radius is 7.25 is" + areaOfCircle);

        //Sqrt of a variable after it's set to 5
        double myVariable = 5;
        double mySqrt = Math.sqrt(5);
        System.out.println("the square root of 5 is " + mySqrt);

        //Distance between points (5, 10) and (85, 50)
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        System.out.println("The distance between the two points is " + distance);

        //Absolute value of a variable after it's set to -3.8
        double num1 = -3.8;
        double absoluteValue = Math.abs(num1);
        System.out.println("The absolute value of -3.8 is " + absoluteValue);

        //Find and display a random number between 0 and 1
        double randomNum = Math.random();
        System.out.println("The random number is " + randomNum);


    }
}