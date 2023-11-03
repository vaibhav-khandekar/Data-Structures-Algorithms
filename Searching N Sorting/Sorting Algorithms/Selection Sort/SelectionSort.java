import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
        int i,j,s,array[],temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array = ");
        s = sc.nextInt();
        array = new int[s];
        System.out.print("enter "+s+" elements in the array = ");
        for (i=0;i<s;i++) {
            array[i] = sc.nextInt();
        }
        for (i=0;i<s-1;i++) {
            for (j=i+1;j<s;j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("sorted array = ");
        for (i=0;i<s;i++) {
            System.out.print(array[i]+" ");
        }
    }
}