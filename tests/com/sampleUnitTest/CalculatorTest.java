package com.sampleUnitTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setup(){
       calculator = new Calculator();
    }

    @Test
    @DisplayName("Multiply Two Num Test")
    public void multiplyNumTest(){
        assertEquals(30,calculator.multiply(5,6));
    }

    @Test
    @DisplayName("Multiplication with zero Test")
    public void multiplyZeroTest(){
        assertEquals(0,calculator.multiply(5,0));
    }

    @Test
    @DisplayName("Multiplication with zero Test2")
    public void multiplyZeroTest2(){
        assertEquals(0,calculator.multiply(0,2));
    }

    @Test
    @DisplayName("Multiply zero with zero")
    public void multiplyZeroTest3(){
        assertEquals(0,calculator.multiply(0,0));
    }

}