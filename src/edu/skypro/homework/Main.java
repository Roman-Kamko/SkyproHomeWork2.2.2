package edu.skypro.homework;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        Car car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        ServiceStation serviceStation = new ServiceStation();

        serviceStation.check(bicycle1);
        printSeparator();
        serviceStation.check(car1);
        printSeparator();
        serviceStation.check(truck1);
        printSeparator();
        serviceStation.checkEngine();
    }

    private static void printSeparator() {
        System.out.println("-------------------------");
    }
}
