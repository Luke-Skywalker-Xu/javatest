package com.xuxiaolan.java.day12;

public class Test5 {
    public static void main(String[] args) {
        for (int n = 1; n < 10; n++) {
            if (n % 2 == 0)
                continue;
            System.out.println(n);
        }
    }
}
