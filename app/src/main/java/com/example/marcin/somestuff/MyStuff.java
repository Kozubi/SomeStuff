package com.example.marcin.somestuff;

/**
 * Created by marcin on 04.12.2016.
 */

public class MyStuff {
    static String name = "hello";
    private static int[] troll = new int[2];

    public static void main(String[] args)
    {

        MyStuff stuff1 = new MyStuff();
        MyStuff stuff2 = new MyStuff();
        MyStuff.troll[1] = 99;

        stuff1.troll[0] = 5;
        System.out.println(stuff1.troll[1]);
        System.out.println(stuff2.troll[1]);
    }
}
