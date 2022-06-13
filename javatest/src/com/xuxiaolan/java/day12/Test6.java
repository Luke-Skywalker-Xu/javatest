package com.xuxiaolan.java.day12;

import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        int $50; //50
        int $20; //20
        int $10;   //10
        int count = 0;
        for ($50 = 0; $50 <= 2; $50++)
            for ($20 = 0; $20 <= 5; $20++)
                for ($10 = 0; $10 <= 10; $10++)
                    if (50 * $50 + 20 * $20 + 10 * $10 == 100) {
                        count++;
                        System.out.println(count);
                        System.out.println("$50=" + $50 + "\n$20=" + $20 + "\n$10=" + $10);
                    }
        System.out.println("一共" + count + "种");
    }
}
