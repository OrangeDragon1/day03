package day3app.core;

public class Main {

    public static void main(String[] args) {
        // Instantiate a car
        Car myCar = new Car();
        // myCar.setColour("red");
        // myCar.colour = "red";
        // myCar.make = "honda";
        // myCar.engineCapacity = 2000;

        System.out.printf("The colour of my car is %s.\n", myCar.getColour());
        
        myCar.start();
        System.out.printf("Driven the car for %d minutes.\n", myCar.getDrivingDuration());
        myCar.stop();
        
        //myCar.setColour("blue");
        //System.out.printf("I have changed colour of my car to %s \n", myCar.getColour());

        //Instantiate another car
        //Car mySecondCar = new Car();
        // myCar.colour = "gray";
        // myCar.make = "toyota";
        // myCar.engineCapacity = 2500;

        //mySecondCar.stop();

    }
    
}
