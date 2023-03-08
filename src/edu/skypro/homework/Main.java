package edu.skypro.homework;

public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();

        Diagnosticable bicycle1 = new Bicycle(" ", -3);
        Diagnosticable bicycle2 = new Bicycle("bicycle2", 2);
        Diagnosticable car1 = new Car("car1", 4);
        Diagnosticable car2 = new Car("", 2);
        Diagnosticable truck1 = new Truck("  ", 0);
        Diagnosticable truck2 = new Truck("truck2", 8);


        serviceStation.check(bicycle1);
        serviceStation.check(bicycle2);
        serviceStation.check(car1);
        serviceStation.check(car2);
        serviceStation.check(truck1);
        serviceStation.check(truck2);
    }
}
