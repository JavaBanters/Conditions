package example11;

// O(log n)
public class BinarySearch {

    public static void main(String[] args){
        int arr [] = {10, 11, 15 ,16, 20, 25, 27, 45 , 48, 50, 53, 61, 67, 71, 77, 80, 84, 90, 100, 104, 119};
        int target = 119;

        int index = findElement(arr, target);

        System.out.println(index);

    }

    private static int findElement(int[] arr, int target) {
        //logic
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                   end = mid -1;
            } else if (target > arr[mid]) {
                    start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
