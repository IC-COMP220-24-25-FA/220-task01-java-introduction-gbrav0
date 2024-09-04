package edu.ithaca.dragon.shapes;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double sideA, double sideB, double sideC){
        if (sideA <= 0 || sideB <= 0 || sideC <= 0){
            throw new IllegalArgumentException("All sides need to be positive.");
        }

        double sideOne = sideA;
        double sideTwo = sideB;
        double sideThree = sideC;
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
