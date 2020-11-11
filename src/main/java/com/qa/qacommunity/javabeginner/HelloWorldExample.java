package com.qa.qacommunity.javabeginner;

public class HelloWorldExample
{
    public static void start()
    {
        System.out.println("Start of Hello World Example");
        taskOne();
        taskTwo();
        taskThree("Hello Word!");
        System.out.println("--- Task Four ---");
        System.out.println(taskFour());
        System.out.println("End of Hello World Example");
    }

    protected static void taskOne() {
        System.out.println("--- Task One ---");
        System.out.println("Hello World!");
    }

    private static void taskTwo() {
        System.out.println("--- Task Two ---");
        String helloWorld = "Hello World!";

        System.out.println(helloWorld);
    }

    private static void taskThree(String input) {
        System.out.println("--- Task Three ---");
        System.out.println(input);
    }

    private static String taskFour() {
        return "Hello World!";
    }

    protected static String testTask(String message) { return message; }
}
