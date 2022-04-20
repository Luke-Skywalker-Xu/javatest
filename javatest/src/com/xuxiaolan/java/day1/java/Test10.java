package com.xuxiaolan.java.day1.java;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //1、提醒用户从键盘输入成绩
        Scanner s;
        s = new Scanner(System.in);
        System.out.print("请输入成绩：");
        //2、对成绩分级
        int cj = s.nextInt();
        int grade =  (cj / 10);
        switch (grade) {
            case 9:case 10:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;
            case 6:
                System.out.println("及格");
                break;
            case 5: case 4:case 3:case 2:case 1:case 0:
                System.out.println("不及格");
                break;
            default:
                System.out.println("不存在");
        }

    }
}