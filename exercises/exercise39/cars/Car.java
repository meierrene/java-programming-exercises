package de.renemeier.udemy.timbuchalka.exercises.exercise39.cars;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return getName() + " -> startEngine()";
    }

    public String accelerate() {
        return getName() + " -> accelerate()";
    }

    public String brake() {
        return getName() + " -> brake()";
    }
}
