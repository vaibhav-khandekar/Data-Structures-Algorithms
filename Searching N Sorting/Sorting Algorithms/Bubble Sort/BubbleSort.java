import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int i,j,s,temp,array[];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array = ");
        s = sc.nextInt();
        array = new int[s];
        System.out.print("enter "+s+" elements in the array = ");
        for (i=0;i<s;i++) {
            array[i] = sc.nextInt();
        }
        for (i=0;i<s-1;i++) {
            for (j=0;j<s-1;j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.err.print("sorted array = ");
        for (i=0;i<s;i++) {
            System.out.print(array[i]+" ");
        }
    }
}