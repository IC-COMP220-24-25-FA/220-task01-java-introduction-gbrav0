package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class ShapeMain {
    
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in); 

        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

        for (int i = 0; i < 5; i++) {
            List<Rectangle> rectangles = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                double width = 1 + random.nextDouble() * 9;
                double heigth = 1 + random.nextDouble() * 9; 
                rectangles.add(new Rectangle(heigth, width));
            }
            System.out.println("Iteration" + (i + 1) + ":");

            for (int j = 0; j < rectangles.size(); j++){
                Rectangle rect = rectangles.get(i);
                System.out.println("Rectangle" + (j + 1) + ":");
                System.out.println("Area: " + rect.calcArea());
                System.out.println("Diagonal: " + rect.longestLineWithin());
            }

            System.out.println("Choose a rectangle to double its size (1-5)");
            int choice = scanner.nextInt();
            if (choice >=1 && choice <=5){
                rectangles.get(choice - 1).doubleSize();
            } else {
                System.out.println("Not a valid response. Not going to resize");
            }
            
            System.out.println("Shapes after doubling a rectangle (if not skipped)");
            for (int j = 0; j < rectangles.size(); j++) {
                Rectangle rect = rectangles.get(j);
                System.out.println("Rectangle " + (j + 1) + ":");
                System.out.println("Area: " + rect.calcArea());
                System.out.println("Diagonal: " + rect.longestLineWithin());
            }
            
            System.out.println();
        }
        scanner.close();
    }
}
