package Problems;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99,110};
        int target = 80;
        System.out.print(ceilingNumber(arr,target));
    }

    static int ceilingNumber(int[] arr, int target) {
        if (target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return arr[start];
    }
}
