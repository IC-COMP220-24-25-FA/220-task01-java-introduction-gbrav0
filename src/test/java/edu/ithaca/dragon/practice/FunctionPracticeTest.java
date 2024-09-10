package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){

        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2)); // These 3 tests are important to test if the method is doing what it should fundamentally.
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1)); // These 3 tests are checking if the negative numbers are being checked.  
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(10, FunctionPractice.calcSalePrice(20, 7, 3)); 
    }
    
    @Test
    public void isGoodDogTest(){
        assertEquals(false, FunctionPractice.isGoodDog(5, 1, false)); 
        assertEquals(true, FunctionPractice.isGoodDog(1, 5, true));  
        assertEquals(false, FunctionPractice.isGoodDog(5, 4, true)); 
        assertEquals(false, FunctionPractice.isGoodDog(0, 6, false)); 
    }

    @Test
    public void findFirstLargestTest(){
        List<Integer> myList = Arrays.asList();
        assertEquals(-1, FunctionPractice.findFirstLargest(myList)); 
        myList = Arrays.asList(1,2,3,4,5);
        assertEquals(4, FunctionPractice.findFirstLargest(myList)); 
        myList = Arrays.asList(1,2,5,4,5);
        assertEquals(2, FunctionPractice.findFirstLargest(myList)); 
        myList = Arrays.asList(1);
        assertEquals(0, FunctionPractice.findFirstLargest(myList));
        myList = Arrays.asList(5,4,3,2,1);
        assertEquals(0, FunctionPractice.findFirstLargest(myList));  
    }

    @Test 
    public void findLastLargestTest(){
        List<Integer> myList = Arrays.asList();
        assertEquals(-1, FunctionPractice.findFirstLargest(myList)); 
        myList = Arrays.asList(1,2,3,4,5);
        assertEquals(4, FunctionPractice.findLastLargest(myList)); 
        myList = Arrays.asList(1,2,5,3,5);
        assertEquals(4, FunctionPractice.findLastLargest(myList));
        myList = Arrays.asList(5);
        assertEquals(0, FunctionPractice.findLastLargest(myList)); 
    }

    @Test 
    public void findFirstMostOccurencesOfLetterTest(){
        List<String> myStr = Arrays.asList("hh","hi","hello");
        assertEquals("hh", FunctionPractice.findFirstMostOccurencesOfLetter(myStr, 'h'));
        myStr = Arrays.asList("hello","world","octopus");
        assertEquals("octopus", FunctionPractice.findFirstMostOccurencesOfLetter(myStr, 'o'));
        myStr = Arrays.asList("hph","hjh","heh");
        assertEquals("hph", FunctionPractice.findFirstMostOccurencesOfLetter(myStr, 'h'));
    }
}
