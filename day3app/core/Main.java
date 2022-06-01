package day3app.core;

public class Main {

    public static void main(String[] args) {
        // Instantiate a car
        Car myCar = new Car();
        // myCar.colour = "red";
        // myCar.make = "honda";
        // myCar.engineCapacity = 2000;

        myCar.start();

        System.out.printf("The colour of my car is %s.\n", myCar.getColour());

        myCar.setColour("blue");
        System.out.printf("I have changed colour of my car to %s /n", myCar.getColour());

        //Instantiate another car
        Car mySecondCar = new Car();
        // myCar.colour = "gray";
        // myCar.make = "toyota";
        // myCar.engineCapacity = 2500;

        mySecondCar.stop();

    }
    
}
