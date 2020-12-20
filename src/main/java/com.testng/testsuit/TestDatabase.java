package com.testng.testsuit;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestDatabase {

    @Test(groups = "brokenTests")
    public void testConnectOracle() {
        System.out.println("testConnectOracle()");
    }

    @Test(groups = "db")
    public void testConnectMsSQL() {
        System.out.println("testConnectMsSQL");
    }

    @Test(groups = { "db", "brokenTests" })
    public void testConnectMySQL() {
        System.out.println("testConnectMySQL");
    }

    @Test(groups = "db-nosql")
    public void testConnectMongoDB() {
        System.out.println("testConnectMongoDB");
    }

    @BeforeGroups(groups={"db"})
    public void testBeforeGroup(){ System.out.println("testBeforeGroup---db"); }

    @AfterGroups(groups={"db"})
    public void testAfterGroup(){ System.out.println("testAfterGroup-----db"); }

    @BeforeGroups(groups={"brokenTests"})
    public void testBeforeGroup2(){ System.out.println("testBeforeGroup---brokenTests"); }

    @AfterGroups(groups={"brokenTests"})
    public void testAfterGroup2(){ System.out.println("testAfterGroup-----brokenTests"); }


}
