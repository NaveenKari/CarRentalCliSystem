package com.demo.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarService {
    CarDAO carDAO = new CarDAO();

    public Car[] getCars(){
        return carDAO.getCars();
    }

    public ArrayList<Car> getAvailableCars(){
        ArrayList<Car> availableCars = new ArrayList<Car>();
        Car[] cars= carDAO.getCars();
        for(Car i: cars){
            if(i.isAvailable()){
                availableCars.add(i);
            }
        }
        return availableCars;
    }

    public ArrayList<Car> getAvailableElectricCars(){
        ArrayList<Car> availableElectricCars = new ArrayList<Car>();
        Car[] cars= carDAO.getCars();
        for(Car i: cars){
            if(Objects.equals(i.getCarType(), "Electric") && i.isAvailable()){
                availableElectricCars.add(i);
            }
        }
        return availableElectricCars;
    }

    public Car getCarById(String id){
        int index = 0;
        Car[] cars= carDAO.getCars();
        for(int i = 0; i<cars.length;i++){
            if(Objects.equals(cars[i].getCarName(), id)){
                index = i;
            }
        }
        return cars[index];
    }

    public void updateCarById(String id){
        int index = 0;
        Car[] cars= carDAO.getCars();
        for(int i = 0; i<cars.length;i++){
            if(Objects.equals(cars[i].getCarName(), id)){
                cars[i].setAvailable(false);
            }
        }
    }

}
