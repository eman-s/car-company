package com.eman;

public class Car {
    private String bodyClassification = BodyType.SEDAN;
    private String engineClassification = EngineType.V;
    private int cylinders;
    private int topSpeed;
    private double fuelCapacityGallons;
    private String color;
    private boolean performancePackage;

    public String getBodyClassification() {
        return bodyClassification;
    }

    public void setBodyClassification(String bodyClassification) {
        this.bodyClassification = bodyClassification;
    }

    public String getEngineClassification() {
        return engineClassification;
    }

    public void setEngineClassification(String engineClassification) {
        this.engineClassification = engineClassification;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getFuelCapacityGallons() {
        return fuelCapacityGallons;
    }

    public void setFuelCapacityGallons(double fuelCapacityGallons) {
        this.fuelCapacityGallons = fuelCapacityGallons;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPerformancePackage() {
        return performancePackage;
    }

    public void setPerformancePackage(boolean performancePackage) {
        this.performancePackage = performancePackage;
    }

}
