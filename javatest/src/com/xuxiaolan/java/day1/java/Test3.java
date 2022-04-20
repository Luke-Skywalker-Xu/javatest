package com.xuxiaolan.java.day1.java;

public class Test3 {
    public static void main(String[] args) {
        //获取三个数字
        int nUm1,nUm2,nUm3;
        double mEan;
        System.out.print("请输入第一个数字：");//给用户的提示
        java.util.Scanner s1= new java.util.Scanner (System.in);//获取键盘输入的对象
        nUm1 =s1.nextInt();
        System.out.print("请输入第二个数字：");//给用户的提示
        nUm2 =s1.nextInt();
        System.out.print("请输入第三个数字：");//给用户的提示
        nUm3 =s1.nextInt();
        mEan =((double) nUm1+ nUm2 + nUm3) / 3;
        System.out.print("平均值：");//给用户的提示
        System.out.println(mEan);
    }
}
