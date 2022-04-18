package com.xuxiaolan.java.day1;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        extracted();
    }
    private static void extracted() {
        //半径
        double fRadius;
        double fArea;
        //1、提醒用户从键盘输入半径
        System.out.print("请输入半径：");//给用户的提示
        Scanner s= new Scanner (System.in);//获取键盘输入的对象
        fRadius =s.nextDouble();
        //1.1、检查用户输入的数据是否正确？
        if ( (fRadius  < 1) || (fRadius > 10)) {
        //1.2、如果不正确(半径不在0~10之间)，提醒用户重新输入；如果正确，继续向后执行
            System.out.println("错误!半径不在0~10之间，请重新输入");
            extracted();
        }
        //2、利用圆面积计算公式，计算圆面积
        else {
            fArea = Math.PI * Math.pow(fRadius,2);
            //3、显示计算结果
            System.out.print("面积："+fArea);//给用户的提示
        }
    }
}
