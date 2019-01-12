package com.course.testng.multiThread;

import org.testng.annotations.Test;

@Test(invocationCount = 10, threadPoolSize = 3)
public class MultiThreadOnAnnotion {
    public void test() {
        System.out.println(1);
        System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
    }
}
