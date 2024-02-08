package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int search = 14;
        System.out.println(binarySearch(arr,search));
    }

    static int binarySearch(int[] arr, int search) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (search > arr[middle]) {
                start = middle + 1;
            } else if (search < arr[middle]) {
                end = middle - 1;
            }
            else {
                return middle; // element found
            }
        }
        return -1; // element not found
    }
}
