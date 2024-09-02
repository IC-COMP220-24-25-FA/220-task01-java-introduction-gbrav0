package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    
    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,0));
    }

    @Test
    public void calcAreaTest(){
        Rectangle myRec= new Rectangle(1,2);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(2, myRec.calcArea(), 0.0001);
        
        myRec = new Rectangle(2,3);
        assertEquals(6, myRec.calcArea(), 0.0001);

        myRec = new Rectangle(4,2);
        assertEquals(8, myRec.calcArea(), 0.0000000001);
    }

    @Test 
    public void doubleSizeTest(){
        Rectangle myRec = new Rectangle(2,3);
        myRec.doubleSize();
        assertEquals(24, myRec.calcArea());
    }

    @Test 
    public void longestLineWithinTest(){
        Rectangle myRec = new Rectangle(2,1);
        assertEquals(2.24, myRec.longestLineWithin(), 0.01);
    }
    
}
