package com.qa.qacommunity.javabeginner;

public class Iteration
{
    public static void start()
    {
        System.out.println("Start of Iteration");
        taskOne();
        taskTwo();
        taskThree();
        taskFive();
        StringIteration.init();
        System.out.println("End of Iteration");
    }

    private static void taskOne()
    {
        System.out.println("--- Initialising Task One ---");
        int A = 100;

        for (int i = 0; i <= 100; i++)
        {
            System.out.println(A);
            A++;
        }
    }

    private static void taskTwo()
    {
        System.out.println("--- Initialising Task Two ---");
        int A = 100;

        for (int i = 0; i <= 100; i++)
        {
            if (A % 2 == 0)
            {
                System.out.print("-");
            }
            else
            {
                System.out.print("*");
            }
            A++;
        }
        System.out.print("\n");
    }

    private static void taskThree()
    {
        System.out.println("--- Initialising Task Three ---");
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(i + ": ");
            for (int j = 1; j <= 10; j++)
            {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    // Task 4 - Replaced while loops with for loops in the previous task methods.

    private static void taskFive()
    {
        System.out.println("--- Initialising Task Five ---");
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }

    private static class StringIteration
    {
        public static void init()
        {
            System.out.println("--- Initialising String Iteration ---");
            taskOne("Hello Java Goodbye World      test     ");
            taskTwo("Polymorphism");
            taskThree("Polymorphism");
            System.out.println(taskFour("Please find the word polymorphism in this message", "polymorphism"));
        }

        private static void taskOne(String input)
        {
            System.out.println("--- Task One ---");
            int wordCount = 0;
            String subStr = " ";
            String lastChar = "";

            for (int i = 0; i < input.length(); i++)
            {
                if (input.substring(i, i + 1).equals(subStr) && !lastChar.equals(subStr))
                {
                    wordCount++;
                }
                else if (i + 1 == input.length() && !lastChar.equals(subStr))
                {
                    wordCount++;
                }
                lastChar = input.substring(i, i + 1);
            }

            System.out.println(wordCount);
        }

        private static void taskTwo(String input)
        {
            System.out.println("--- Task Two ---");
            for (int i = 0; i < input.length(); i++)
            {
                System.out.println(input.substring(i, i + 1));
            }
        }

        private static void taskThree(String input)
        {
            System.out.println("--- Task Three ---");
            for (int i = input.length(); i > 0; i--)
            {
                System.out.println(input.substring(i - 1, i));
            }
        }

        private static Boolean taskFour(String message, String target)
        {
            System.out.println("--- Task Four ---");
            String targetFirst = target.substring(0, 1);
            boolean foundTarget = false;

            for (int i = 0; i < message.length(); i++)
            {
                if (message.substring(i, i + 1).equals(targetFirst))
                {
                    if (message.substring(i, i + target.length()).equals(target))
                    {
                        foundTarget = true;
                    }
                }
            }

            return foundTarget;
        }
    }
}
