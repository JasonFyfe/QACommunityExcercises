package com.qa.qacommunity.javabeginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputWithScanner
{
    private static List<Person> people = new ArrayList<>();

    public static void start()
    {
        System.out.println("Start of Input With Scanner");
        Calculator.init();
        System.out.println("--- Task Two ---");
        taskTwo();
        System.out.println("End of Input With Scanner");
    }

    private static void taskTwo()
    {
        people.add(new Person("Bob", 25, "HR Manager"));
        people.add(new Person("Barbara", 34, "Team Leader"));
        people.add(new Person("Jason", 30, "Developer"));

        peopleMenu();
    }

    private static void printAllPeople(List<Person> people)
    {
        for (Person p : people)
        {
            System.out.println(p.getAllDetails());
        }
    }

    private static void nameSearch(String name)
    {
        Person temp = null;
        boolean personFound = false;

        for (Person p : people)
        {
            if (p.getName().equals(name))
            {
                personFound = true;
                temp = p;
            }
        }

        if (personFound) {
            System.out.println("Person Found\n" + temp.getAllDetails());
        } else {
            System.out.println("Person: " + name + " was not found.");
        }
    }

    private static void peopleMenu()
    {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int menuOption;
        String name;
        int age;
        String jobTitle;
        boolean loopMenu = true;

        while (loopMenu)
        {
            System.out.println("\nPlease select from the following options: ");
            System.out.println("1. Create a new Person.");
            System.out.println("2. Print all People.");
            System.out.println("3. Search for a Person.");
            System.out.println("4. Quit Application");

            menuOption = sc.nextInt();

            switch (menuOption)
            {
                case 1 -> {
                    System.out.println("New Person's Name?");
                    name = sc.next();
                    System.out.println("New Person's Age?");
                    age = sc.nextInt();
                    System.out.println("New Person's Job Title?");
                    jobTitle = sc.next();
                    people.add(new Person(name, age, jobTitle));
                }
                case 2 -> printAllPeople(people);
                case 3 -> {
                    System.out.println("Enter name to search for:");
                    name = sc.next();
                    nameSearch(name);
                }
                case 4 -> loopMenu = false;
                default -> System.out.println("Invalid Input.");
            }
        }
    }


    private static class Calculator
    {
        private static int addition(int a, int b)
        {
            return a + b;
        }

        private static int subtraction(int a, int b)
        {
            return a - b;
        }

        private static int multiplication(int a, int b)
        {
            return a * b;
        }

        private static double division(int a, int b)
        {
            return (double) a / b;
        }

        public static void init()
        {
            Scanner sc = new Scanner(System.in);
            boolean menuLoop = true;
            int menuSelect;
            int num1 = 0;
            int num2 = 0;

            while (menuLoop)
            {

                System.out.println("\nPlease select from the following options: ");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit Application");

                menuSelect = sc.nextInt();

                if (menuSelect != 5)
                {
                    System.out.println("Enter your first number: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter your second number: ");
                    num2 = sc.nextInt();
                }
                else
                {
                    System.out.println("Exiting Calculator.");
                }

                switch (menuSelect)
                {
                    case 1 -> System.out.println(num1 + " + " + num2 + " = " + addition(num1, num2));
                    case 2 -> System.out.println(num1 + " - " + num2 + " = " + subtraction(num1, num2));
                    case 3 -> System.out.println(num1 + " * " + num2 + " = " + multiplication(num1, num2));
                    case 4 -> System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
                    case 5 -> menuLoop = false;
                    default -> System.out.println("Invalid Input");
                }
            }

        }
    }
}

class Person
{
    private String name;
    private int age;
    private String jobTitle;

    public Person(String name, int age, String jobTitle)
    {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        System.out.printf("New Person Created\nName: %s | Age: %d | Job Title: %s\n%n", this.name, this.age, this.jobTitle);
    }

    public String getAllDetails()
    {
        return String.format("Name: %s | Age: %d | Job Title: %s", name, age, jobTitle);
    }

    public String getName()
    {
        return name;
    }
}
