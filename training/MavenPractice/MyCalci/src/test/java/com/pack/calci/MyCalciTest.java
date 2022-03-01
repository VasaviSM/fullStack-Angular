package com.pack.calci;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class MyCalciTest {

    @Test
    public void add() {
        System.out.println("Add is executed");
        Assertions.assertEquals(5,MyCalci.Add(3,2));
    }

    @Test
    public void subtract() {
        System.out.println("Subtract is executed");
        Assertions.assertEquals(-4,MyCalci.Subtract(4,8));
    }

    @Test
    public void multiply() {
        System.out.println("Multiply is executed");
        Assertions.assertEquals(20,MyCalci.Multiply(5,4));
    }

    @Test
    public void divide() {
        System.out.println("Divide is executed");
        Assertions.assertEquals(5,MyCalci.Divide(10,2));
    }
}