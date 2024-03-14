package com.qu1etboy.basic.services;

import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {

    @Test
    public void testAddNumber() {
        MyMath m = new MyMath();

        Assert.assertEquals(m.add(4, 5), 9.0, 0.001);
    }
}