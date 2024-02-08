package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int s,i,search;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array = ");
        s = sc.nextInt();
        int[] arr = new int[s];
        System.out.print("enter " + s + " sorted elements in the array = ");
        for (i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("your array = ");
        for (i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nenter element to search in array = ");
        search = sc.nextInt();
        int start=0, end = s-1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (search < arr[middle]) {
                end = middle - 1;
            } else if (search > arr[middle]) {
                start = middle + 1;
            }
            else if (search == arr[middle]) {
                System.out.print(search + " element is located at " + middle + " position in the array");
                break;
            }
            else {
                System.out.print(search + " element is not found in the array");
            }
        }
    }
}
