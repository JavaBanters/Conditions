package example11;

public class LinearSearch {

    public static void main(String[] args){
        int [] arr = {12,45,23,78,11,10,99}; //
        int target = 230;

        //int index = findIndexOfNumber(arr , target); //find index

        boolean isPresent = findNumber(arr , target);

        System.out.println(isPresent);

       //System.out.println(index);

    }

    private static int findIndexOfNumber(int[] arr, int target) {
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static boolean findNumber(int[] arr, int target) {
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }

}
