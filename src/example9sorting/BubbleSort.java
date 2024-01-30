package example9sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){
        //int [] arr = {5,4,3,2,1};
        //int [] arr = {1,2,3,4,5};
        int [] arr = {21,-23,0,100,123,23,-4,123,53,21,9,1,-56};
        System.out.println(Arrays.toString(arr));
        performBubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void performBubbleSort(int[] arr) {

        for (int i = 0; i< arr.length; i++) {
            boolean isSwapped = false;
            for(int j = 1 ; j <arr.length - i; j++) {
                if(arr[j-1] > arr[j]) {
                    isSwapped = true;
                    swap(arr, j-1 , j );
                }
            }

           if(!isSwapped) break;

        }

    }
    private static void swap(int[] arr, int i , int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

}
