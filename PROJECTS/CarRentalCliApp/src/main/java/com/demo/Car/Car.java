package com.demo.Car;

public class Car {
    private String carName;
    private String model;
    private String carType;
    private boolean isAvailable;
    private int price;

    public Car(String carName, String model, String carType, boolean isAvailable, int price) {
        this.carName = carName;
        this.model = model;
        this.carType = carType;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
