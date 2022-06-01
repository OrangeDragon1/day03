package day3app.core;

public class Car implements Controllable{
    
    // properties, members for a class
    private String colour;
    protected String make;
    private Integer engineCapacity;
    private Boolean started = false; 
    private Long startedSince; 

    // default contructor
    public Car() {
        System.out.println("Instantiating car object");
        this.colour = "red";
    }
    // constructor that passes in values
    public Car(Integer capacity) {
        this.engineCapacity = capacity; 
    }
    // constructor to pass in multiple values
    public Car(String c, String brand) {
        this.colour = c;
        this.make = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Boolean isStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    // behaviour, methods
    public Long getDrivingDuration() {
        if (this.started) {
            return (System.currentTimeMillis() - this.startedSince) / 1000;
        }
    }
    public void start() {
        if (this.started) {
            System.err.println("Your car is running.");
        } else {
            System.out.println("Vroom...");
            this.started = true; 
            this.startedSince = System.currentTimeMillis();
        } 
    }

    public void stop() {
        if (this.started) {
            System.out.println("Your car is not running.");
        } else {
            System.out.println("Splutter splutter stop...");
            this.started = false;
        }
    }

}
