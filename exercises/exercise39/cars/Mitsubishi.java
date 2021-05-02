package de.renemeier.udemy.timbuchalka.exercises.exercise39.cars;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getName() + " -> brake()";
    }
}
