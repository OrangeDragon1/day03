package day3app.core;

public class Honda extends Car {
    
    public Honda() {
        this.make = "Honda";
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    public void stop(Integer count) {
        System.out.printf("Stopping in %d seconds...\n", count);
    }
}
