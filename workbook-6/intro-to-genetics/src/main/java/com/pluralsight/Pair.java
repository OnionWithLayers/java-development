package com.pluralsight;

//             new objects made from this can only be Musicians now
//              we only care about the 'T' info which is why that is extending
public class Pair<T extends Musician> {
    private T leftThing;
    private T rightThing;

    public Pair(T leftThing, T rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }

    public T getLeftThing() {
        return leftThing;
    }

    public void setLeftThing(T leftThing) {
        this.leftThing = leftThing;
    }

    public T getRightThing() {
        return rightThing;
    }

    public void setRightThing(T rightThing) {
        this.rightThing = rightThing;
    }

    public void swap(){
        T temp = leftThing;
        leftThing = rightThing;
        rightThing = temp;
    }

    public void perform(){
        leftThing.perform();
        rightThing.perform();
    }
}
