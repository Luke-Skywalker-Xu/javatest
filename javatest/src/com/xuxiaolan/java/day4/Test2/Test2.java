package com.xuxiaolan.java.day4.Test2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double b=1;
        double sum=1;
        for(int i=1;i<n+1;i++){
            b=b*i;
            sum+=1/b;
        }
        System.out.printf("%.8f",sum);
    }
}

