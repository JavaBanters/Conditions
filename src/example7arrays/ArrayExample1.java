package example7arrays;

public class ArrayExample1 {

    public static void main(String[] args) {
        int arr [] = {43, 29, 21, 67, 29 ,1 ,29, 34, 78, 21};
        int target = 29;
        int result = findOccurrences(arr, target);
        System.out.println("The occurrence of the target "+target+ " is "+result);
    }


    static int findOccurrences(int arr[], int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        return count;
    }


}
