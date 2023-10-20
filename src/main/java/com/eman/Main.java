package com.eman;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var carCompany = new CarCompany();
        var floridaFactory = new CarFactory(State.FL);
        var SUV = new Car(BodyType.SUV, EngineType.V, false, 8, 6, 100, 18.2, Color.BLACK, false);
        var sedan = new Car(BodyType.SEDAN, EngineType.V, true, 5, 4, 120, 12, Color.WHITE, true);
        floridaFactory.getCars().add(SUV);
        floridaFactory.getCars().add(sedan);
        carCompany.getFactories().add(floridaFactory);
    }
}