package example6arrays;

public class ArrayIni {

    public static void main(String[] args) {
        int arr [] = {2,4,5,6,78,34,67};
        String [] arrString = {"an","at","kt","bt"};



        //System.out.println(Arrays.toString(arr));
        //arr[6] = 100;
        //arr[2] = -1;
        //System.out.println(Arrays.toString(arrString));


        //example of program
        int target = 2;
        boolean found = search(arr, target);
        System.out.println(found);

    }
    //int arr [] = {2,4,5,6,78,34,67};

    public static boolean search(int [] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target) {
                return true;
            }
        }
        return false;
    }

}
