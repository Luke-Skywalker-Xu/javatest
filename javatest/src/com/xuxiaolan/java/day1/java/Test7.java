package com.xuxiaolan.java.day1.java;

public class Test7 {
    public static void main(String[] args) {
        extracted();
        extracted1();
        extracted2();
        extracted3();
    }

    private static void extracted3() {
        double a = 6.5;
        a += a + 1;
        System.out.println(a);
    }

    private static void extracted2() {
        int b;
        int a = 6;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }

    private static void extracted1() {
        int a = 6;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
    }

    private static void extracted() {
        int a = 6;
        a /= 2;
        System.out.println(a);
    }
}
