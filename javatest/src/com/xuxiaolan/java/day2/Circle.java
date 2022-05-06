package com.xuxiaolan.java.day2;

public class Circle {
    public Circle(double fRadius) {
        this.fRadius = fRadius;
    }

    public double getAre() {
        return Math.PI * fRadius * fRadius;
    }

    public double getRadius() {
        return fRadius;
    }

    public void setRadius(double fRadius) {
        this.fRadius = fRadius;
    }

    private double fRadius;

    public static void main(String[] args) {
        Circle c0 = new Circle(2.0);
        System.out.println("The area of circle of radius:" + c0.getRadius() + "is:" + c0.getAre());
    }
}


