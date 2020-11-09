package com.qa.qacommunity.javabeginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList
{
    public static void start()
    {
        System.out.println("Start of ArrayList");
        init();
        System.out.println("End of ArrayList");
    }

    private static void init()
    {
        List<String> values = new java.util.ArrayList();

        values.add("Mac");
        values.add("Bandit");
        values.add("Bella");
        values.add("Jake");
        values.add("Taylor");
        values.add("Ralph");
        values.add("Peggy");

        for (int i = 0; i < values.size(); i++)
        {
            System.out.println(i + ": " + values.get(i));
        }

        for (String s : values)
        {
            System.out.println(s);
        }

        System.out.println(java.util.Arrays.toString(values.toArray()));
        values.set(2, "Poppy");
        System.out.println(java.util.Arrays.toString(values.toArray()));

        values.remove(2);

        System.out.println(java.util.Arrays.toString(values.toArray()));
        Collections.sort(values);
        System.out.println(java.util.Arrays.toString(values.toArray()));

        Collections.reverse(values);
        System.out.println(java.util.Arrays.toString(values.toArray()));

        Collections.swap(values, 0, 1);
        System.out.println(Arrays.toString(values.toArray()));
    }
}
