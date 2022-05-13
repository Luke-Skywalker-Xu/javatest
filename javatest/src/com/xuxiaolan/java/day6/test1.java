package com.xuxiaolan.java.day6;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) throws FileNotFoundException {
        java.io.File file = new java.io.File("student.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String fistName = input.next();
            String two = input.next();
            String three = input.next();
            String lastName = input.next();
            if (lastName.equals("student")) {
                lastName = "teacher";
            }
            System.out.println(fistName + " “+twO+"+"+three+"+lastName);
        }
        input.close();
    }
}