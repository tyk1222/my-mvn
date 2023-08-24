package org.example;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAddTrue() throws Exception {
        Calculator calc = new Calculator();
        int actualValue = calc.add(5, 10);
        int expectValue = 15;

        assertTrue(actualValue == expectValue);
    }
    public void testAddFalse() throws Exception {
        Calculator calc = new Calculator();
        int actualValue = calc.add(5, 10);
        int expectValue = 24;

        assertTrue(actualValue != expectValue);
    }
    public void testAddExeption() {
        Calculator calc = new Calculator();
        try {
            int result = calc.add(15, 20);
            assertTrue(false);
        } catch (Exception ex) {
            assertTrue(true);
        }
    }
}