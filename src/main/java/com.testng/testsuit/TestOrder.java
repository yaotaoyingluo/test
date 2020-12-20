package com.testng.testsuit;

import org.testng.annotations.Test;

public class TestOrder {

    //(groups={"orderBo", "save"})
    @Test
    public void testMakeOrder() {
        System.out.println("testMakeOrder");
    }

    @Test
    public void testMakeEmptyOrder() {
        System.out.println("testMakeEmptyOrder");
    }

    //(groups="orderBo")
    @Test
    public void testUpdateOrder() {
        System.out.println("testUpdateOrder");
    }

    @Test
    public void testFindOrder() {
        System.out.println("testFindOrder");
    }


}
