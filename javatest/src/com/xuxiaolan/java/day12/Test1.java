package com.xuxiaolan.java.day12;

public class Test1 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        for (; ; ) {
            sum = sum + i;
            i++;
            if (i > 10) break;
        }
        System.out.println(sum);
    }
}
