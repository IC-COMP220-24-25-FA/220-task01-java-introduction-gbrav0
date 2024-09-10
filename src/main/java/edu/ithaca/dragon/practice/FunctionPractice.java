package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0 || second < 0 || third < 0){
            throw new IllegalArgumentException("numbers need to be positive");
        } else {
            int largest = Math.max(Math.max(first, second), third);
            return largest;
        }
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        return (originalPrice - discountPercent) - salesTax;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (daysSinceShoesChewed >= 5 && fetchedThePaperToday == true){
            return true;
        } else { 
            return false;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.size() == 0){
            return -1;
        }
        int maxIndex = 0;
        for (int i = 1; i < numbers.size(); i++){
            if (numbers.get(i) > numbers.get(maxIndex)){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.size() == 0){
            return -1;
        }
        int maxIndex = 0;
        for (int i = 1; i < numbers.size(); i++){
            if (numbers.get(i) >= numbers.get(maxIndex)){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    /**
     * @return the string that has contains the most occurences of the given letter
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
