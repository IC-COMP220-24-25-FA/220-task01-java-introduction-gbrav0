package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape {
    private double length; 
    private double width;
    

    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0){
            throw new IllegalArgumentException("Needs to be positive number");
        }
        
        this.length = length;
        this.width = width; 
    }

    public double calcArea(){
       return this.length * this.width;
    }
    
    // Doubled length and width (doubling area)
    public void doubleSize(){
        this.length = this.length * 2;
        this.width = this.width * 2;
    }

    public double longestLineWithin(){
        return Math.hypot(this.length, this.width);
    }

    public String toString(){
        return "Rectangle Length: " + length + " | " + "Rectangle Width: " + width; 
    }
    
}
