package edu.skypro.homework;

public class ServiceStation implements ServiceFunctions {

    public void check(Bicycle bicycle) {
        printCheckTransport(bicycle);
        updateTyres(bicycle);
        printSeparator();
    }

    public void check(Car car) {
        printCheckTransport(car);
        updateTyres(car);
        checkEngine();
        printSeparator();
    }

    public void check(Truck truck) {
        printCheckTransport(truck);
        updateTyres(truck);
        checkEngine();
        checkTrailer();
        printSeparator();
    }

    private void printCheckTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
    }

    private void updateTyres(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            updateTyre();
        }
    }

    private static void printSeparator() {
        System.out.println("-------------------------");
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
