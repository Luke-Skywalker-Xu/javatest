package com.xuxiaolan.java.day1.java;

import java.util.Scanner;

public class Test12 {
    //if …… else if ……
    public static void main(String[] args) {
        //BMI
        double BMI;
        //体重
        double weight;
        //身高
        double height;
        //1、通过键盘输入获取身高和体重
        System.out.print("请输入体重(单位：公斤)：");
        Scanner s1;
        s1 = new Scanner(System.in);
        weight = s1.nextDouble();
        System.out.print("请输入身高(单位：米)：");
        Scanner s2;
        s2 = new Scanner(System.in);
        height = s2.nextDouble();
        //2、根据公式 BMI=体重除以身高的平方 求出BMI
        BMI = weight / (height * height);
        System.out.println("BMI:" + (int) BMI);
        if (BMI < 0) {
            System.out.println("请重新输入");
        } else if (BMI < 18.5) {
            System.out.println("体重过轻");
        } else if (BMI < 25) {
            System.out.println("正常");
        } else if (BMI < 30) {
            System.out.println("超重");
        } else if (BMI > 30) {
            System.out.println("肥胖");
        }
    }
}
