package com.demo.Booking;

import com.demo.Car.Car;
import com.demo.User.User;

public class Booking {
    private String id;
    private User user;
    private Car car;

    public Booking(String id, User user, Car car) {
        this.id = id;
        this.user = user;
        this.car = car;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
