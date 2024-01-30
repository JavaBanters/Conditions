package example7arrays;

public class ArrayExample2 {

    public static void main(String[] args) {
        int arr [] = {-43, -23, -21, -67, -29 ,-1 ,-29, -34, -78, -21};
        int maximumNum = findMax(arr);
        System.out.println("The maximum number is "+ maximumNum);
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
