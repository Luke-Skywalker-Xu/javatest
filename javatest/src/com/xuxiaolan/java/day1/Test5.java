package com.xuxiaolan.java.day1;

public class Test5 {
    public static void main(String[] args) {
        long aMs;//总毫秒数
        long aS;//总秒数
        long aM;//总秒数
        long aH;//总小时
        long cS;//当前秒
        long cM;//当前分钟
        long cH;//当前小时
        //获取毫秒数
        aMs = System.currentTimeMillis();
        //获取总秒数
        aS = aMs / 1000;
        //获取当前秒数
        cS = aS % 60;
        //获取总分钟
        aM = aS / 60;
        //获取当前分钟
        cM = aM % 60;
        //获取总小时
        aH = aM / 60;
        //获取当前小时
        cH=aH % 24;
        //打印在屏幕
        System.out.println(cH+":"+cM+":"+cS);
    }
}

