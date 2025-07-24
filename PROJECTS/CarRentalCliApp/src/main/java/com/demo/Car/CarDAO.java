package com.demo.Car;

public class CarDAO {

    private static final Car[] cars = {
            new Car("Tesla","Model Y","Electric",true,90),
            new Car("Honda Accord","Model 2020","Normal",true,70),
            new Car("Camry","Model 2009","Normal",true,50),
            new Car("MG Hector","Model X","Electric",true,100),
    };

    public Car[] getCars(){
        return cars;
    }
}
