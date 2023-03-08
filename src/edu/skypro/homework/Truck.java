package edu.skypro.homework;

public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void setWheelsCount(int wheelsCount) {
        if (wheelsCount < 4) {
            super.setWheelsCount(4);
        } else {
            super.setWheelsCount(wheelsCount);
        }
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateAllWheels();
        checkEngine();
        checkTrailer();
    }
}
