package com.qa.qacommunity.javabeginner;

public class EnhancedForLoops
{
    public static void start()
    {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Start of Enhanced For Loops");
        taskOne();
        taskTwo(intArray);
        System.out.println("--- Task Three ---");
        System.out.println(taskThree(2));
        System.out.println(taskThree(3));
        taskFour(intArray);
        System.out.println("End of Enhanced For Loops");
    }

    private static void taskOne()
    {
        System.out.println("--- Task One ---");
        String[] stringArray = {"Test0", "Test1", "Test2", "Test3", "Test4", "Test5", "Test6"};

        for (String s : stringArray)
        {
            System.out.print(s + " ");
        }
        System.out.print("\n");
    }

    private static void taskTwo(int[] input)
    {
        System.out.println("--- Task Two ---");
        for (int i : input)
        {
            System.out.print(i * i + " ");
        }
        System.out.print("\n");
    }

    private static Boolean taskThree(int input)
    {
        return input % 2 == 0;
    }

    private static void taskFour(int[] input)
    {
        System.out.println("--- Task Four ---");
        for (int i : input)
        {
            if (taskThree(i))
            {
                System.out.print(i * i * i + " ");
            }
            else
            {
                System.out.print(i * i + " ");
            }
        }
        System.out.print("\n");
    }
}
