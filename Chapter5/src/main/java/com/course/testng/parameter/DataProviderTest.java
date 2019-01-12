package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name=" + name + "\t" + "age=" + age);
    }

    @DataProvider(name="data")
    public Object[][] providerData() {
        Object[][] ob = new Object[][]{
                {"zhangsan", 24},
                {"lisa", 36},
                {"wangwu", 34}
        };
        return ob;
    }

    @Test(dataProvider = "dataMethod")
    public void test1(String name, int age) {
        System.out.println("test1中的方法:" + "name=" + name + "\t" + "age=" + age);
    }

    @Test(dataProvider = "dataMethod")
    public void test2(String name, int age) {
        System.out.println("test2中的方法:" + "name=" + name + "\t" + "age=" + age);
    }

    @DataProvider(name="dataMethod")
    public Object[][] methodData(Method method) {
        Object[][] result = null;
        if(method.getName().equals("test1")) {
            result = new Object[][] {
                    {"wangerxiao", 23},
                    {"sherong", 25}
            };
        } else if(method.getName().equals("test2")) {
            result = new Object[][]{
                    {"bindada", 24},
                    {"lixiaobin", 36}
            };
        }
        return result;
    }
}
