package Searching;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        int start = 2, end = 6;
        System.out.println(search1(arr,target,start,end));
        System.out.println(search2(arr,target,start,end));
        System.out.println(search3(arr,target,start,end));
    }

    static int search1(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i < end; i++) {
            if (i == target) {
                return 1;
            }
        }
        return -1;
    }

    static boolean search2(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return false;
        }

        for (int i = start; i < end; i++) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }

    static int search3(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int i = start; i < end; i++) {
            if (i == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
