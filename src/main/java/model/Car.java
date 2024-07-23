package model;

public class Car {
    private int id;
    private String model;
    private String color;

    @Override
    public String toString() {
        return id + " " + model + " " + color;
    }

    public Car(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }
}
