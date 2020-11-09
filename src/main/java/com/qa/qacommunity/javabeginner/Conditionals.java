package com.qa.qacommunity.javabeginner;

public class Conditionals
{
    public static void start()
    {
        System.out.println("\nStart of Conditionals");
        flowchartOne.init();
        flowchartTwo.init();
        blackJack.init();
        uniqueSum.init();
        taxes.init();
        numbers.init();
        System.out.println("End of Conditionals");
    }

    private static class flowchartOne
    {
        public static void init()
        {
            System.out.println("--- Initialising Flowchart One ---");
            System.out.println(flow(1, 2, true));
            System.out.println(flow(3, 3, false));
            System.out.println(flow(1, 1, true));
        }

        private static Integer flow(int a, int b, boolean bool)
        {
            if (bool)
            {
                return a + b;
            }
            else
            {
                return a * b;
            }
        }
    }

    private static class flowchartTwo
    {
        public static void init()
        {
            System.out.println("--- Initialising Flowchart Two ---");
            flow(7000);
            flow(5000);
            flow(3000);
            flow(650);
            flow(550);
            flow(400);
            flow(50);
        }

        private static void flow(int a)
        {
            if (a > 2000)
            {
                System.out.print("A");
                if (a > 6000)
                {
                    System.out.print("C");
                }
                else
                {
                    System.out.print("B");
                    if (a > 4000)
                    {
                        System.out.print("D");
                    }
                    else
                    {
                        System.out.print("E");
                    }
                }
            }
            else
            {
                System.out.print("1");
                if (a > 100)
                {
                    System.out.print("3");
                    if (a > 600)
                    {
                        System.out.print("5");
                    }
                    else
                    {
                        System.out.print("4");
                        if (a > 500)
                        {
                            System.out.print("6");
                        }
                        else
                        {
                            System.out.print("7");
                        }
                    }
                }
                else
                {
                    System.out.print("2");
                }
            }
            System.out.print("\n");
        }
    }

    private static class blackJack
    {
        public static void init()
        {
            System.out.println("--- Initialising Blackjack ---");
            System.out.println(play(10, 21));
            System.out.println(play(20, 18));
            System.out.println(play(1, 22));
            System.out.println(play(22, 23));
        }

        private static Integer play(int a, int b)
        {
            if (a <= 21 && b <= 21)
            {
                return Math.max(a, b);
            }
            else
            {
                if (a > 21 && b > 21)
                {
                    return 0;
                }
                else if (a > 21)
                {
                    return b;
                }
                else
                {
                    return a;
                }
            }
        }
    }

    private static class uniqueSum
    {
        public static void init()
        {
            System.out.println("--- Initialising Unique Sum ---");
            System.out.println(input(1, 2, 3));
            System.out.println(input(3, 3, 3));
            System.out.println(input(1, 1, 3));
            System.out.println(input(3, 2, 3));
            System.out.println(input(1, 3, 3));
        }

        private static Integer input(int a, int b, int c)
        {
            if (a != b && a != c && b != c)
            {
                return a + b + c;
            }
            else if (a == b && a != c)
            {
                return c;
            }
            else if (a == c && a != b)
            {
                return b;
            }
            else if (a != b)
            {
                return a;
            }
            else
            {
                return 0;
            }
        }
    }

    private static class taxes
    {
        public static void init()
        {
            System.out.println("--- Initialising Taxes ---");
            System.out.println(taxAmount(45000));
            System.out.println(taxAmount(44999));
            System.out.println(taxAmount(30000));
            System.out.println(taxAmount(29999));
            System.out.println(taxAmount(20000));
            System.out.println(taxAmount(19999));
            System.out.println(taxAmount(15000));
            System.out.println(taxAmount(14999));
        }

        private static Integer taxPercentage(int salary)
        {
            if (salary >= 45000)
            {
                return 25;
            }
            else if (salary >= 30000)
            {
                return 20;
            }
            else if (salary >= 20000)
            {
                return 15;
            }
            else if (salary >= 15000)
            {
                return 10;
            }
            else
            {
                return 0;
            }
        }

        private static Double taxAmount(int salary)
        {
            int percentage = taxPercentage(salary);
            return (double) (salary / 100) * percentage;
        }
    }

    private static class numbers
    {
        public static void init() {
            System.out.println("--- Initialising Numbers ---");
            for (int i = 0; i < 101; i++)
            {
                digitConversion(i);
            }
        }

        private static void digitConversion(int input)
        {
            char[] number = Integer.toString(input).toCharArray();

            String[] single_digits = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            String[] two_digits = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
            String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            String[] tens_power = new String[]{"hundred", "thousand"};

            int len = number.length;

            if (len == 0 || len > 4)
            {
                System.out.println("Invalid Input");
            }

            if (len == 1)
            {
                System.out.println(single_digits[number[0] - '0']);
            }
            else
            {
                int x = 0;
                while (x < number.length - 1)
                {
                    String output = "";

                    if (len >= 3)
                    {
                        output += single_digits[number[len - 3] - '0'] + "-" + tens_power[len - 3];
                    }
                    else
                    {
                        if (number[0] - '0' == 1)
                        {
                            int sum = number[1] - '0';
                            output = two_digits[sum];
                        }
                        else
                        {
                            if (number[1] - '0' != 0)
                            {
                                output += tens_multiple[number[0] - '0'] + "-" + single_digits[number[1] - '0'];
                            }
                            else
                            {
                                output += tens_multiple[number[0] - '0'];
                            }
                        }
                    }
                    System.out.println(output);
                    x++;
                }
            }
        }
    }
}
