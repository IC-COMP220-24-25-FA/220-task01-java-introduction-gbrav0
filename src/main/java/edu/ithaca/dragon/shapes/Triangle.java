package edu.ithaca.dragon.shapes;

public class Triangle {
    private double sideA;
    private double sideB;


    public Triangle(double sideA, double sideB){
        if (sideA <= 0 || sideB <= 0){
            throw new IllegalArgumentException("All sides need to be positive.");
        }

        double base = sideA;
        double height = sideB;
    }

    public double calcArea(){
        throw new IllegalAccessError("Not implemented yet");


    }

    public double longestLineWithin(){
        throw new IllegalAccessError("Not implemented yet");

    }

    public double doubleSize(){
        throw new IllegalAccessError("Not implemented yet");

    }
}
