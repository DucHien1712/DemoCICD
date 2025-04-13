package com.poly.lab8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testSum() {
        Calculator caculator = new Calculator();
        Assert.assertEquals(caculator.sum(2, 3), 5);
    }

    @Test
    public void testSub() {
        Calculator caculator = new Calculator();
        Assert.assertEquals(caculator.sub(3, 2), 1);
    }
}
