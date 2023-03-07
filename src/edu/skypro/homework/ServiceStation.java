package edu.skypro.homework;

public class ServiceStation implements ServiceFunctions {

    public void check(Bicycle bicycle) {
        printCheckTransport(bicycle);
        updateTyres(bicycle);
    }

    public void check(Car car) {
        printCheckTransport(car);
        updateTyres(car);
        checkEngine();
    }
    public void check(Truck truck) {
        printCheckTransport(truck);
        updateTyres(truck);
        checkEngine();
        checkTrailer();
    }

    public void printCheckTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
    }

    public void updateTyres(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            updateTyre();
        }
    }
    @Override
    public void updateTyre() {
            System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
