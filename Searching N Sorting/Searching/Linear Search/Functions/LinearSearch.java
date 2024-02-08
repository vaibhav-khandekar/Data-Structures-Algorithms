package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int search1 = 3;
        int ans1 = linearSearch1(array,search1);
        System.out.println(ans1);
        int search2 = 5;
        int ans2 = linearSearch2(array,search2);
        System.out.println(ans2);
        int search3 = 9;
        boolean ans3 = linearSearch3(array,search3);
        System.out.print(ans3);
    }

    static int linearSearch1(int[] arr, int search) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i=0;i<arr.length;i++) {
            if (search == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int search) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int i : arr) {
            if (search == i) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int[] arr, int search) {
        if (arr.length == 0) {
            return false;
        }

        for (int i : arr) {
            if (search == i) {
                return true;
            }
        }
        return false;
    }
}
