package edu.skypro.homework;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        Car car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        ServiceFunctions serviceStation = new ServiceStation();

        serviceStation.check(bicycle1);
        serviceStation.check(car1);
        serviceStation.check(truck1);
    }
}
