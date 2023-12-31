package org.example;

public class TestRunner {

    int count, passedCount, failedCount;

    public void test(String name, Runnable test) {

        try {
            test.run();
            passedCount++;
        } catch (RuntimeException ex) {
            System.out.println("Test failed: " + name + " : " + ex.getMessage());
            failedCount++;
        }
        count++;

    }

    public void printSummary() {
        System.out.println("Tests finished, passed: " + passedCount + " failed: " + failedCount);
    }

}
