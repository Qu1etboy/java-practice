package com.qu1etboy.basic;

public class Basic {

    public static void main(String[] args) {
        // Java primitive type
        byte bt = 1;  // 1 byte
        short a = 5; // 2 bytes
        int b = 5; // 4 bytes
        long c = 3; // 8 bytes
        double d = 5.2; // 8 bytes
        float e = 3.4f; // 4 bytes (3.4 -> double by default)
        char f = 'c'; // 1 byte
        char[] g = {'H', 'E', 'L', 'L', 'O'};
        String h = "Hello, World";
        boolean t = true; // 1 bit (true | false)

        // Narrowing (manual)
        int i = (int) 5.2; // Type casting
        // Widening (auto)
        double j = 5; // Casting by default (int -> double)

//        System.out.println(i);

        System.out.println(stuff());

    }

    public static boolean stuff() {
        char c = 'a';
        String s = Character.toString(c);

        return s.equals("a");
    }
}
