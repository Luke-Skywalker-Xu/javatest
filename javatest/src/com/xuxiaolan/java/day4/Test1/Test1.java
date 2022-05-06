package com.xuxiaolan.java.day4.Test1;

public class Test1 {
    public static void main(String[] args) {
        Test1_Queue queue = new Test1_Queue();
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }
        for (int i = 1; i <= 20; i++) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
