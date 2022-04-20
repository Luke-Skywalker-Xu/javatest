package com.xuxiaolan.java.day1.java;


import java.util.Optional;

import static jdk.nashorn.internal.objects.NativeMath.sqrt;


public class Hello {
    static double func(double x) {        //待求解方程
        return x * x * x * x - 3 * x * x * x + 1.5 * x * x - 4.0;
    }

    static double dfunc(double x) {        //导数方程
        return 4 * x * x * x - 9 * x * x + 3 * x;
    }

    static int NewtonMethod(double x[], int maxcyc, double precision) {
        double x0, x1;
        int i;
        x0 = x[0];
        i = 0;
        while (i < maxcyc) {
            if (dfunc(x0) == 0.0) {        //如果导数为0，直接输出，因为导数为0，无法用牛顿迭代法
                System.out.println("迭代过程中导数为0");
                return 0;
            }
            x1 = x0 - func(x0) / dfunc(x0);            //按照公式求解
            if (Math.abs(x1 - x0) < precision || Math.abs(func(x1)) < precision) {        //达到了要求的精度
                x[0] = x1;        //得到迭代值
                return 1;
            } else {        //否则继续循环，寻找迭代值
                x0 = x1;
            }
            i++;        //加一循环
        }
        System.out.println("迭代次数超过预设值！仍没有达到精确度！");
        return 0;
    }

    public static void main(String[] args) {
        double precision;
        int maxcyc, result;
        double[] x = {2.0};        //初始值
        maxcyc = 1000;
        precision = 0.00001;
        result = NewtonMethod(x, maxcyc, precision);
        if (result == 1) {
            System.out.printf("方程x*x*x*x-3*x*x*x+1.5*x*x-4.0=0\n在2.0附近的根为%f\n",
                    x[0]);
        } else {
            System.out.println("迭代失败！\n");
        }
    }
}