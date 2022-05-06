package com.xuxiaolan.java.day1.java;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        double fS, cS;
        //1、通过键盘输入获取华氏度
        Scanner s1;
        System.out.print("请输入华氏度：");
        s1 = new Scanner(System.in);
        fS = s1.nextDouble();
        //2、通过华氏度转换摄氏度的公式：F=1.8×C+32 计算摄氏度
        cS = (fS - 32) / 1.8;
        //3、屏幕打印摄氏度
        System.out.println("摄氏度" + cS);
    }
}
