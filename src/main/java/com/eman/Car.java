package com.eman;

public class Car {
    private final String bodyClassification;
    private final String engineClassification;
    private final boolean turbo;
    private final int numberOfSeats;
    private final int cylinders;
    private final int topSpeed;
    private final double fuelCapacityGallons;
    private final Color color;
    private final boolean performancePackage;

    private Car(){
        bodyClassification = BodyType.SUV;
        engineClassification = EngineType.INLINE;
        turbo = false;
        numberOfSeats = 2;
        cylinders = 8;
        topSpeed = 300;
        fuelCapacityGallons = 20;
        color = Color.RED;
        performancePackage = false;

    }

    public Car(String bodyClassification, String engineClassification, boolean turbo, int numberOfSeats, int cylinders, int topSpeed, double fuelCapacityGallons, Color color, boolean performancePackage) {
        this.bodyClassification = bodyClassification;
        this.engineClassification = engineClassification;
        this.turbo = turbo;
        this.numberOfSeats = numberOfSeats;
        this.cylinders = cylinders;
        this.topSpeed = topSpeed;
        this.fuelCapacityGallons = fuelCapacityGallons;
        this.color = color;
        this.performancePackage = performancePackage;
    }

    public String getBodyClassification() {
        return bodyClassification;
    }


    public String getEngineClassification() {
        return engineClassification;
    }


    public int getCylinders() {
        return cylinders;
    }


    public int getTopSpeed() {
        return topSpeed;
    }


    public double getFuelCapacityGallons() {
        return fuelCapacityGallons;
    }


    public Color getColor() {
        return color;
    }


    public boolean isPerformancePackage() {
        return performancePackage;
    }


    public boolean isTurbo() {
        return turbo;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

}
