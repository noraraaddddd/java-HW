package com.Nora;

public class Main {

    public static void main(String[] args) {
	Car car = CarFactory.getCar(Car.Hyundai);
    car.start();
    }
}
