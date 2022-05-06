package com.xuxiaolan.java.day1.java;

import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 6, 5, 3, 8, 4, 14};// 定义一个数组
        Arrays.sort(intArray);// 排序
        System.out.println(Arrays.toString(intArray));//打印排序后的数组
        int result = search(intArray, 14);
        System.out.println(result);
    }

    public static int search(int[] intArray, int k) {
        int max = intArray.length - 1;// 最大索引
        int min = 0;// 最小索引
        int mid = (max + min) / 2;// 中间索引x
        while (k != intArray[mid]) {
            if (min <= max) {
                if (k < intArray[mid]) {
                    max = mid - 1;// 因为k<中间值，往前半段比较，那么最大值也要变
                } else if (k > intArray[mid]) {
                    min = mid + 1;/// 因为k>中间值，往后半段比较，那么最小值也要变
                }
                mid = (max + min) / 2;// max和min变了，mid也要变
            } else {
                System.out.println("未找到数据");
                mid = -1;
                break;
            }
        }
        return mid;
    }
}

