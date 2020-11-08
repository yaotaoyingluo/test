package com.testng;

import org.testng.Assert;
import org.testng.annotations.*;

//@Test
public class TestStudent {

    public TestStudent() {
        System.out.printf("构造器===");
    }

    /**
     * 测试类中必须需要有@Test标注的测试方法 其他的注解注释的方法才会执行
     * @BeforeMethod  @AfterMethod 只在标注了@Test的方法前后执行
     * @BeforeTest  @AfterTest 在beforeclass之前 afterclass之后
     */



    @BeforeClass
    public  void testBeforeClass(){
        System.out.printf("BeforeClass---------");
    }

    @BeforeMethod
    public void  testBeforeMethod(){
        System.out.printf("BeforeMethod---------");
    }

    @BeforeTest
    public void testBeforeTest(){
        System.out.printf("BeforeTest----------");
    }

    @AfterTest
    public void testAfterTest(){
        System.out.printf("AfterTest----------");
    }

    @Test
    public void test1111(){
        System.out.printf("test1111-----------");
    }


    @Test(priority = 10)
    public void test(){
        System.out.printf("test-----------");
        Assert.assertEquals(1,1);
        Assert.assertEquals(1,1);
        boolean s=true;
        Assert.assertTrue(s);
        boolean a=true;
        Assert.assertTrue(a,"true");

    }

    @AfterMethod
    public void  testAfterMethod(){
        System.out.printf("AfterMethod---------");
    }


    @AfterClass
    public void  testAfterClass(){
        System.out.printf("AfterClass---------");
    }

}
