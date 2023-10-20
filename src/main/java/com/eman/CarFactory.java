package com.eman;

import java.util.Set;

public class CarFactory {
    private final State state;
    private Set<Car> cars;

    private CarFactory() {
        state = State.FL;
    }

    public CarFactory(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }


    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}
