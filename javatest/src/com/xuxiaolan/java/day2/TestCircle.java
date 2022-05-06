package com.xuxiaolan.java.day2;

import java.util.Scanner;

public class TestCircle {
    public static int maximum(int i, int j) {
        int p = j;
        j = i;
        i = p;
        return (i >= j) ? i : j;
    }

    public static Circle maximum(Circle first, Circle second) {
        Circle p = first;
        first = second;
        second = p;
        if (first.getRadius() >= second.getRadius())
            p = first;
        else
            p = second;
        return p;
    }

    public static void main(String[] args) {
        System.out.println("Input radius of circle: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        Circle c0 = new Circle(r);
        System.out.println("The area of circle of radius:" + c0.getRadius() + "is:" + c0.getAre());
    }
}
