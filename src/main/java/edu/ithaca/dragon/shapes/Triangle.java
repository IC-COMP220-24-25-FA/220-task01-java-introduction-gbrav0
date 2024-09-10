package edu.ithaca.dragon.shapes;

public class Triangle implements Shape {
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
        return Math.hypot(sideB, sideA);

    }

    public void doubleSize(){
        sideA = sideA * 2;
        sideB = sideB * 2;

    }

    public String toString(){
        return "Triangle Base: " + sideA + " | " + "Triangle Height: " + sideB;
    }
}
