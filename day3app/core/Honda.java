package day3app.core;

public class Honda extends Car {
    
    public Honda() {
        this.make = "Honda";
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating");
    }
}
