package com.xuxiaolan.java.day1.java;

import java.util.Scanner;

public class Test13 {
    //迭代计算
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入贷款金额（元）：");
        double a = sc.nextDouble();
        System.out.print("请输入每月还款金额（元）：");
        double x = sc.nextDouble();
        System.out.print("请输入贷款期限（年）：");
        double n = sc.nextDouble() * 12;
        System.out.print("误差精确到小数点后几位精度：");
        int ina = sc.nextInt();
        //计算200次，误差精确到小数点后10位
        double rate = Test13.rate(a, x, n, 200, ina);
        System.out.print("月利率:" + rate * 100 + "%");
    }
    // 给出一种计算方式具体是试出来的，从1开始 一次减少0.1，，减到0.1后，每次再减少，0.01
    // a是贷款金额，b为每月还款金额，c为贷款期限，cnt为计算次数，ina为精度
    public static double rate(double a, double b, double c, int cnt, int ina) {
        double rate = 1, x, jd = 0.1, side = 0.1, i = 1;
        do {
            x = a / b - (Math.pow((1 + rate), c) - 1) / (Math.pow((1 + rate), c) * rate);
            if (x * side > 0) {
                side = -side;
                jd *= 10;
            }
            rate += side / jd;
        } while (i++ < cnt && Math.abs(x) >= 1 / Math.pow(10, ina));
        return rate;
    }
}

