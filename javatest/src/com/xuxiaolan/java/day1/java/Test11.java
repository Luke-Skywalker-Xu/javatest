package com.xuxiaolan.java.day1.java;

import static java.lang.Math.random;

public class Test11 {
    public static void main(String[] args) {
        for(int i =0;i<=10;i++){
            double a = Math.floor(random() * 100) ;
            if ( (i%5) == 0){
                System.out.println ("Five");
            }
            if ( (i%2) == 0){
                System.out.println ("Even");
            }
        }
    }

}