package com.xuxiaolan.java.day1.java;

import com.xuxiaolan.java.tool.Colors;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Test8 {
    public static void main(String[] args) {
        test1();

//        //借贷金额
//        double loan;
//        //月利率
//        double monthlyRate;
//        //月利率
//        double percentMonthlyRate;
//        //总还款金额
//        double totalRepayment;
//        //贷款年份
//        double yearLoan;
//        //每月还款金额
//        double monthlyRepayment;
//        //键盘输入
//        Scanner s1, s2, s3;
//        //1、键盘输入借贷金额
//        System.out.print("请输入借贷金额（元）：");
//        s1 = new Scanner(System.in);
//        loan = s1.nextDouble();
//        //键盘输入每月还款
//        System.out.print("请输入每月还款（元）：");
//        s2 = new Scanner(System.in);
//        monthlyRate = s2.nextDouble();
//        monthlyRepayment = monthlyRate * 0.01;
//        //键盘输入贷款年份
//        System.out.print("请输入贷款年份（年）：");
//        s3 = new Scanner(System.in);
//        yearLoan = s3.nextDouble();

        //利息 = 本金×利率×时间
        //本金 = loan
        //利率 = monthlyRepayment
        //时间 = yearLoan * 3

        //10000/3400=1/-[1/A(1+A)^36]







//        System.out.println("利率："+"percentMonthlyRate");
    }

    private static void test1() {
        //借贷金额
        double loan;
        //月利率
        double monthlyRate;
        //月利率
        double percentMonthlyRate;
        //总还款金额
        double totalRepayment;
        //贷款年份
        double yearLoan;
        //每月还款金额
        double monthlyRepayment;
        //键盘输入
        Scanner s1, s2, s3;
        //1、键盘输入借贷金额
        System.out.print("请输入借贷金额（元）：");
        s1 = new Scanner(System.in);
        loan = s1.nextDouble();
        //键盘输入贷款月利率
        System.out.print("请输入贷款月利率（%）：");
        s2 = new Scanner(System.in);
        monthlyRate = s2.nextDouble();
        //百分数转换成小数
        percentMonthlyRate = monthlyRate * 0.01;
        //键盘输入贷款年份
        System.out.print("请输入贷款年份（年）：");
        s3 = new Scanner(System.in);
        yearLoan = s3.nextDouble();
        //2、通过公式计算
        //每月还款金额
        monthlyRepayment = ((loan * percentMonthlyRate )* ((pow((1 + percentMonthlyRate),yearLoan * 12) ) / ((pow((1 + percentMonthlyRate),yearLoan * 12) )- 1)));
        //总还款金额
        totalRepayment = (yearLoan *12) * monthlyRepayment;
        //3、屏幕打印每月还款金额
        System.out.println("每月还款金额：" + Colors.getFormatLogString((String.format("%.2f", monthlyRepayment)), 31, 0) + " 元");
        //4、屏幕打印总还款金额
        System.out.println("借贷"+Colors.getFormatLogString((String.format("%.0f", yearLoan)), 31, 0)+"年需要还的金额：" + Colors.getFormatLogString((String.format("%.2f", totalRepayment)), 31, 0) + " 元");


        }

}