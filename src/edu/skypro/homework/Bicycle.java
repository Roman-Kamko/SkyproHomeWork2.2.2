package edu.skypro.homework;

public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void setWheelsCount(int wheelsCount) {
        if (wheelsCount < 2) {
            super.setWheelsCount(2);
        } else {
            super.setWheelsCount(wheelsCount);
        }
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateAllWheels();
    }
}
