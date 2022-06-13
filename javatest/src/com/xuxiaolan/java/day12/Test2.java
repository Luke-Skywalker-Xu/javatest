package com.xuxiaolan.java.day12;

public class Test2 {
    public static void main(String[] args) {
        int result = 0;
        int i = 0;
        int randomNum;
        while (i < 50) {
            randomNum = (int) (Math.random() * 10);
            if (randomNum == 5)
                result++;
            i++;
        }
        System.out.println(result);
    }
}
