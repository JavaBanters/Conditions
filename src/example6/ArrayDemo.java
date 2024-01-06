package example6;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:::");
        int size = in.nextInt();
        int [] arr = new int[size]; // declaring the size of the arry
        System.out.println("Enter the array elements for size " + size);
        for(int i = 0; i < arr.length ; i++) {
            int ele = in.nextInt();
            arr[i] = ele; //initializing
        }

        System.out.println("The array elements are ");
        for(int element: arr) {
            System.out.println(element);
        }


    }

}
