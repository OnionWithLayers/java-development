import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world, 0, -50);
       /* int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);*/

        double radius = Math.pow(Math.PI * 100, 2);
        double circumference = Math.pow(Math.PI * radius, 2);
        // self-explanatory. sets the width of pen and sets the color to green
        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.setDelay(0);
/*
        //CIRCLE
        for (int i = 0; i < 40; i++){
            turtle.turnRight(circumference);
            turtle.forward(10);
        }
*/
/*

        //SQUARE
        for (int i = 0; i < 4; i++) {
            turtle.forward(50);
            turtle.turnRight(90);
        }
*/

        //SLICE OF PIE
        Turtle turtleGuy = new Turtle(world, 60, 0);
        turtleGuy.setDelay(0);
        turtleGuy.setPenWidth(3);

        turtleGuy.turnLeft(90);
        for (int i = 0; i < 24; i++) {
            turtleGuy.turnLeft(circumference);
            turtleGuy.forward(14);
        }
        turtleGuy.turnLeft(86);
        turtleGuy.forward(63);
        turtleGuy.turnRight(90);
        turtleGuy.forward(59);

        turtleGuy.goTo(60, 0);

        turtle.penUp();
        turtle.goTo(63, -20);
        turtle.penDown();
        turtle.backward(51);
        turtle.goTo(12, -80);

//        turtle.turnLeft(90);
        for (int i = 0; i < 6; i++) {
            turtle.turnLeft(14);
            turtle.forward(14);
        }

       /* turtle.turnRight(-90);
//        turtle.forward(hypotenuse);
        turtle.forward(radius);*/

       /* turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);*/
    }
}
