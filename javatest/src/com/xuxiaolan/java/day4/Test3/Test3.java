package com.xuxiaolan.java.day4.Test3;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = input.nextInt();

        Test3_StackOfIntegers soi = new Test3_StackOfIntegers(num);
        int[] arr = soi.getIntegers();

        Arrays.sort(arr);
        for (int i = arr.length - 1 ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
