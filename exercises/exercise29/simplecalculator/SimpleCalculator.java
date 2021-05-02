package de.renemeier.udemy.timbuchalka.exercises.exercise29.simplecalculator;

public class SimpleCalculator {
    public double firstNumber;
    public double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return (firstNumber + secondNumber);
    }

    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return (firstNumber / secondNumber);
    }
}
