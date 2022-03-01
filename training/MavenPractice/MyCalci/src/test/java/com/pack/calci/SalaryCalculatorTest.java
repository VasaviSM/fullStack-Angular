package com.pack.calci;

/*
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class SalaryCalculatorTest {

    private SalaryCalculator salaryCalculator;

    @Before
    public void init(){
        salaryCalculator = new SalaryCalculator();
    }

    @Test
    public void testBaseSalary(){

        double baseSalary = 5000;
        salaryCalculator.setBaseSalary(baseSalary);

        double expectedSocialInsurance = baseSalary * 0.25;
        assertEquals(expectedSocialInsurance,salaryCalculator.getSocialInsurance());

        double expectedAdditionalBonus = baseSalary * 0.1;
        assertEquals(expectedAdditionalBonus,salaryCalculator.getAdditionalBonus());

        double expectedGrossIncome = baseSalary + expectedSocialInsurance + expectedAdditionalBonus;
        assertEquals(expectedSocialInsurance,salaryCalculator.getGrossIncome());

    }

    @DisplayName("Testing for invalid salary calculator...")

    @Test
    public void invalidSalaryCalculatorTest(){

        double baseSalary = -1;
        assertThrows(IllegalArgumentException.class, ()->{
            salaryCalculator.setBaseSalary(baseSalary);
        });
    }


    @Before
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
        salaryCalculator = null;
    }
}*/

/*import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import static org.junit.Assert.*;

public class SalaryCalculatorTest {


    private SalaryCalculator salaryCalculator;

    @Before
    public void init()
    {
        salaryCalculator=new SalaryCalculator();
    }
    @DisplayName(" Testing for invalid salary calculator..")

    @Test
    public void invalidSalaryCalculatorTest()
    {
        double basesalary = -10;
        assertThrows(IllegalArgumentException.class, () -> {
            salaryCalculator.setBaseSalary(basesalary);
        });
    }
    @AfterEach
    public void teardown() throws Exception {
        salaryCalculator = null;
    }

}*/


import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SalaryCalculatorTest {


    private SalaryCalculator salaryCalculator;

    @BeforeEach
    void init()
    {
        salaryCalculator=new SalaryCalculator();
    }
    @Test
    void testBaseSalary()
    {
        double baseSalary=4000;
        salaryCalculator.setBaseSalary(baseSalary);
        double expectedSocialInsurance = baseSalary * 0.25;

        assertEquals(expectedSocialInsurance,salaryCalculator.getSocialInsurance());
        double expectedAdditionalBonus = baseSalary * 0.1;
        assertEquals(expectedAdditionalBonus , salaryCalculator.getAdditionalBonus());

        double exprectedGrossIncome = baseSalary + expectedSocialInsurance + expectedAdditionalBonus ;
        assertEquals( exprectedGrossIncome,salaryCalculator.getGrossIncome());
    }

    @DisplayName(" Testing for invalid salary calculator..")

    @Test
    public void invalidSalaryCalculatorTest()
    {
        double basesalary = -10;
        assertThrows(IllegalArgumentException.class, () -> {
            salaryCalculator.setBaseSalary(basesalary);
        });
    }
    @AfterEach
    public void teardown() throws Exception {
        salaryCalculator = null;
    }

}