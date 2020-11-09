package com.qa.qacommunity.javabeginner;

public class Operators
{
    public static void start()
    {
        System.out.println("\nStart of Operators");
        Calculator.init(20, 5);
        Results.init(50, 100, 150);
        System.out.println("End of Operators");
    }

    private static class Calculator
    {
        public static void init(int a, int b)
        {
            System.out.println("--- Initialising Calculator ---");
            System.out.println("5 + 5 = " + Addition(a, b));
            System.out.println("5 * 5 = " + Multiplication(a, b));
            System.out.println("5 - 47 = " + Subtraction(a, b));
            System.out.println("25 - 5 = " + Division(a, b));
        }

        private static Integer Addition(int a, int b)
        {
            return a + b;
        }

        private static Integer Multiplication(int a, int b)
        {
            return a * b;
        }

        private static Integer Subtraction(int a, int b)
        {
            return a - b;
        }

        private static double Division(int a, int b)
        {
            return (double) a / b;
        }
    }

    private static class Results
    {
        private static int Physics = 90;
        private static int Chemistry = 90;
        private static int Biology = 90;
        private static final int Total = Physics + Chemistry + Biology;

        public static void init(int physics, int chemistry, int biology)
        {
            System.out.println("--- Initialising Results ---");
            Physics = physics;
            Chemistry = chemistry;
            Biology = biology;
            display();
            percentage();
        }

        private static void display()
        {
            System.out.println("Physics Grade: " + Physics);
            System.out.println("Chemistry Grade: " + Chemistry);
            System.out.println("Biology Grade: " + Biology);
            System.out.println("Total Mark: " + Total);
        }

        private static void percentage()
        {
            double totalPercent = (double) (Total * 100) / 450;
            double physicsPercent = (double) (Physics * 100) / 150;
            double chemistryPercent = (double) (Chemistry * 100) / 150;
            double biologyPercent = (double) (Biology * 100) / 150;
            boolean pass = true;

            if (totalPercent >= 60.0)
            {
                if (physicsPercent < 60.0)
                {
                    System.out.printf("Physics: %.2f (Fail)\n", physicsPercent);
                    pass = false;
                }
                else
                {
                    System.out.printf("Physics: %.2f (Pass)\n", physicsPercent);
                }

                if (chemistryPercent < 60.0)
                {
                    System.out.printf("Chemistry: %.2f (Fail)\n", chemistryPercent);
                    pass = false;
                }
                else
                {
                    System.out.printf("Chemistry: %.2f (Pass)\n", chemistryPercent);
                }

                if (biologyPercent < 60.0)
                {
                    System.out.printf("Biology: %.2f (Fail)\n", biologyPercent);
                    pass = false;
                }
                else
                {
                    System.out.printf("Biology: %.2f (Pass)\n", biologyPercent);
                }

                if (pass) {
                    System.out.printf("Overall Percentage: %.2f (Pass)\n", totalPercent);
                } else {
                    System.out.printf("Overall Percentage: %.2f (Fail)\n", totalPercent);
                }

            }
            else
            {
                System.out.printf("Percentage: %.2f (Fail)\n", totalPercent);
            }

        }
    }
}
