//package Searching N Sorting.Searching.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int array[],s,i,search;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array = ");
        s = sc.nextInt();
        array = new int[s];
        System.out.print("enter "+s+" elements in the array = ");
        for (i=0;i<s;i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("your array = ");
        for (i=0;i<s;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("\nenter element to search = ");
        search = sc.nextInt();
        for (i=0;i<s;i++) {
            if (search == array[i]) {
                System.err.println(search+" is at "+i+" location of the array");
                break;
            }
        }
        if (i == s) {
            System.err.println(search+" element is not present in the array.");
        }
    }
}