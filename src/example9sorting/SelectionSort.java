package example9sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){
        //int [] arr = {5,4,3,2,1};
        //int [] arr = {1,2,3,4,5};
        int [] arr = {5,0,-1,7,2,3};
        //int [] arr = {21,-23,0,100,123,23,-4,123,53,21,9,1,-56};
        System.out.println(Arrays.toString(arr));
        //performSelectionSort(arr);
        //int maxElement = findMaxElement(arr); // 3
        //performSelectionSort(arr);
        selectionSort(arr);
        //System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        for(int j = 0 ; j < arr.length; j++) {
            int max = findMaxElementWithRange(arr, arr.length - j);
            int min = findMinElementWithRange(arr, j);

            System.out.println(min);
            //swap(arr, max, arr.length - 1 - j );
        }

    }

    // to do
    private static int findMinElementWithRange(int[] arr, int startIndex) {
        int min = startIndex ;
        for (int i = startIndex + 1; i < arr.length; i++) {
            if(arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    private static int findMaxElementWithRange(int[] arr, int range) {
        int max = 0 ;
        for (int i = 1; i < range; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static int findMaxElement(int[] arr) {
        int max = 0 ;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
    }

    private static void performSelectionSort(int[] arr ) {
        for(int i = 0 ; i < arr.length; i++) {
            int max = 0;
            for (int j = 1; j < arr.length - 1 -  i; j++) {
                if(arr[j] > arr[max]) {
                    max = j;
                }
            }
            swap(arr, max,  arr.length - 1 - i);
        }
    }

}
