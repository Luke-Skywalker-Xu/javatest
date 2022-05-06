package com.xuxiaolan.java.day4.Test3;

public class Test3_StackOfIntegers {
    int num;
    public Test3_StackOfIntegers(int num){
        this.num = num;
    }
    public int[] getIntegers(){
        int[] feedback = new int[0], temp;
        int length;
        boolean bool;
        for (int i = 2 ; i < num ; i++){
            bool = true;
            for (int n = 2 ; n < i ; n++){
                if (i % n == 0){
                    bool = false;
                }
            }
            if (bool){
                temp = new int[feedback.length + 1];
                length = feedback.length;
                for (int index = 0 ; index < length ; index++){
                    temp[index] = feedback[index];
                }
                temp[length] = i;
                feedback = temp;
            }
        }
        return feedback;
    }
}
