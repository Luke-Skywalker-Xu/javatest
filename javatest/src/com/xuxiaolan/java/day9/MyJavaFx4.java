package com.xuxiaolan.java.day9;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class MyJavaFx4 {
    public static void main(String[] args) {
        DoubleProperty balance =new SimpleDoubleProperty();

        balance.addListener(observable -> System.out.println("the new value is"+balance.doubleValue()));
        balance.set(4.5);
    }
}
