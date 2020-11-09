package com.qa.qacommunity.javabeginner;

public class Arrays
{
    public static void start()
    {
        System.out.println("Start of Arrays");
        taskOne();
        taskTwo();
        System.out.println("End of Arrays");
    }

    private static void taskOne() {
        System.out.println("--- Initialising Task One ---");
        int values[] = new int[10];

        for (int i = 0; i < values.length; i++)
        {
            values[i] = i;
        }

        for (int i : values)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    private static void taskTwo() {
        System.out.println("--- Initialising Task One ---");
        int values[] = new int[10];

        for (int i = 0; i < values.length; i++)
        {
            values[i] = i;
            System.out.print(values[i] + " ");
        }
        System.out.print("\n");

        for (int i : values)
        {
            values[i] = i * 10;
            System.out.print(values[i] + " ");
        }
        System.out.print("\n");
    }
}
