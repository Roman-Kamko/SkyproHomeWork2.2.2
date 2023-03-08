package edu.skypro.homework;

public abstract class Transport implements Diagnosticable{
    private String modelName;
    private int wheelsCount;
    private static int counter;

    public Transport(String modelName, int wheelsCount) {
        setModelName(modelName);
        setWheelsCount(wheelsCount);
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        if (modelName.isEmpty() || modelName.startsWith(" ")) {
            this.modelName = "Transport" + ++counter;
        } else {
            this.modelName = modelName;
        }
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateWheel() {
        System.out.println("Меняем покрышку");
    }

    public void updateAllWheels() {
        for (int i = 0; i < wheelsCount; i++) {
            updateWheel();
        }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
