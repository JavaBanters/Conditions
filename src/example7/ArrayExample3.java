package example7;

public class ArrayExample3 {

    public static void main(String[] args) {
        int arr [] = {43, 29, 21, 67, 29 ,1 ,29, 34, -78, 21};
        int minimumNum = findMin(arr);
        System.out.println("The minimum number is "+ minimumNum);
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0 ; i < arr.length; i++) {
            if ( arr[i] < min) {
                min = arr[i];
            }
        }

        return min;

    }
}
