package com.example.cashregister;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CashRegisterTests {

    CashRegister sut;
    Integer availableFunds;
    Integer itemCost;

    @Before
    public void beforeEachTestMethod() {
        availableFunds = 100;
        sut = new CashRegister(availableFunds);
        itemCost = 42;
    }

    @After
    public void afterEachTestMethod() {
        availableFunds = 0;
        sut = null;
        itemCost = 0;
    }

    @Test
    public void testInit_createsCashRegister() {
        //When
        CashRegister sut = new CashRegister();

        //Then
        assertNotNull(sut);
    }

    @Test
    public void testInitAvailableFunds_setAvailableFunds() {
        //Then
        assertEquals(availableFunds, sut.availableFunds);
    }

    @Test
    public void testAddItem_oneItem_addsCostToTransactionTotal() {
        //When
        sut.addItem(itemCost);

        //Then
        assertEquals(itemCost, sut.transactionTotal);
    }

    @Test
    public void testAddItem_twoItems_addsCostsToTransactionTotal() {
        //Given
        Integer itemCost2 = 42;
        Integer expectedTotal = itemCost + itemCost2;

        //When
        sut.addItem(itemCost);
        sut.addItem(itemCost2);

        //Then
        assertEquals(expectedTotal, sut.transactionTotal);
    }

}
