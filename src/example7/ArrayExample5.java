package example7;

public class ArrayExample5 {

    public static void main(String[] args) {
        //int arr1D [] = new int [5];
        //int arr [row] [columns] = new int [3][3]; Declaration

        int arr [] [] = {{ 1, 2, 3},
                        {4, 5, 6},
                        {7 , 8, 9}} ;

//        System.out.print(arr[0][0]+ " "); //row = 0
//        System.out.print(arr[0][1]+ " ");
//        System.out.print(arr[0][2]+ " ");
//
//        System.out.println();
//
//        System.out.print(arr[1][0]+ " ");
//        System.out.print(arr[1][1]+ " ");
//        System.out.print(arr[1][2]+ " ");
//
//        System.out.println();
//
//        System.out.print(arr[2][0]+ " ");
//        System.out.print(arr[2][1]+ " ");
//        System.out.print(arr[2][2]+ " ");

//        int arr [] [] = {{ 1, 2, 3}, 0
//                          {4, 5, 6}, 1
//                          {7 , 8, 9}} ;


        for (int row = 0 ; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }

    }

}
