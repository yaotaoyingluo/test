package com.testng.testparammterized;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParamsFromXml {

    @Test
    @Parameters({"stuName","stuCount"})
    public void testParamsFromXml(String stuName, int stuCount) {
        System.out.println("学生姓名：" + stuName);
        System.out.println("学生个数：" + stuCount);

    }
}
