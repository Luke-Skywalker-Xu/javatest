package com.xuxiaolan.java.day1;

public class Test2 {
    public static void main(String[] args){
        //1、取得圆的半径
        double fRadius;
        System.out.print("请输入半径：");//给用户的提示
        java.util.Scanner s= new java.util.Scanner (System.in);//获取键盘输入的对象
        fRadius =s.nextDouble();
        //2、计算面积
        double fArea;
        fArea = Math.PI * Math.pow(fRadius,2);
        //3、输出
        System.out.print("面积：");//给用户的提示
        System.out.println(fArea);
    }
}
