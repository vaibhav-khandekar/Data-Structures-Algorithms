package Problems;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99,111};
        int target = 85;
        System.out.print(floorNumber(arr,target));
    }

    static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return arr[middle];
            }
        }
        return arr[end];
    }
}
