package com.demo.Booking;

import com.demo.Car.Car;
import com.demo.User.User;

public class Booking {
    private int id;
    private User user;
    private Car car;

    public Booking(int id, User user, Car car) {
        this.id = id;
        this.user = user;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", car=" + car +
                '}';
    }
}
