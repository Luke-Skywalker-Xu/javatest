package com.xuxiaolan.java.day4.Test1;

public class Test1_Queue {
    private int[] element;
    private int size = 0;

    public Test1_Queue() {
        element = new int[8];
    }

    public void enqueue(int v) {
        if (size == element.length) {
            element = enlarge(element);
        }
        element[size] = v;
        size++;
    }

    public int[] enlarge(int[] arr) {
        int[] temp = new int[size * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public int dequeue() {
        int temp = element[0];
        System.arraycopy(element, 1, element, 0, size);
        if (size == element.length) {
            element[size--] = 0;
        }
        return temp;
    }

    public boolean empty() {
        boolean bool = false;
        if (element[0] == 0) {
            bool = true;
        }
        return bool;
    }

    public int getSize() {
        // 这里的队列没有指代清楚到底是队列中含有元素的多少还是容量
        // 这里我处理为队列中元素的数量
        return size;
    }
}
