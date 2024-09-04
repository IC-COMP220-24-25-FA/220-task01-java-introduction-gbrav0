package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test 
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1,2,0));
    }
    
    @Test 
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(1,1,1);
        assertEquals(0.5, myTriangle.calcArea(),0.001);

    }
}
