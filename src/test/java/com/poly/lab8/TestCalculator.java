package com.poly.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculator {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.sum(2, 3), 5);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.sub(5, 2), 3);
    }
}
