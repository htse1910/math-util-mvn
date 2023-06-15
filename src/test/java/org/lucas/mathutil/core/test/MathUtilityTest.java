/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.lucas.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.lucas.mathutil.core.MathUtility;
import static org.lucas.mathutil.core.MathUtility.getFactorial;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenWrongArgumentThrowsException(){
        //assertThrows(expectedType,                  executable);
        //          ngoại lệ cần bắt        đưa đoạn code gây ra ngoại lệ
        //                                  đưa 1 object chứa đoạn code gây Exception
        //                                  lambda expression đưa vào
        Executable ex = new Executable(){
            @Override
            public void execute()throws Throwable{
                getFactorial(-5);
            }
        };
        Executable exLamda = () -> getFactorial(-5);
        
        assertThrows(IllegalArgumentException.class, exLamda);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //assertEquals(69, 69);
        assertEquals (1,MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals (2,MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals (24,MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
}
