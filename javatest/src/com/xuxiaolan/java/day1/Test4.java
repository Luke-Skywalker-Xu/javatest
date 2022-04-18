package com.xuxiaolan.java.day1;

import java.util.Scanner;

public class Test4 {
    static final double a = 1.609344;
    public static void main(String[] args) {
        double OutKm,mI;
        Scanner s1;
        System.out.print("请输入英里：");
        s1= new Scanner (System.in);
        mI =s1.nextDouble();
        OutKm =mI * a;
        System.out.print("公里：" + OutKm);
    }
}
