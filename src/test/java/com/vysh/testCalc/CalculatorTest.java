package com.vysh.testCalc;

import com.vysh.calc.Calculator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }


    @Test
    public void addTest() {
        Assert.assertTrue(calculator.add(2, 3) == 5);
        System.out.println("addTest - ok");
    }

    @Test
    public void subTest() {
        Assert.assertTrue(calculator.sub(5, 3) == 2);
        System.out.println("subTest - ok");
    }

}
