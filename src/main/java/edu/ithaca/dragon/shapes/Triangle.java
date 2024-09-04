package edu.ithaca.dragon.shapes;

public class Triangle {
    private double sideA;
    private double sideB;


    public Triangle(double base, double height){
        if (base <= 0 || height <= 0){
            throw new IllegalArgumentException("All sides need to be positive.");
        }

        sideA = base;
        sideB = height;
    }

    public double calcArea(){
        return (sideA * sideB) / 2;

    }

    public double longestLineWithin(){
        throw new IllegalAccessError("Not implemented yet");

    }

    public double doubleSize(){
        throw new IllegalAccessError("Not implemented yet");

    }
}
