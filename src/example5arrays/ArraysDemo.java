package example5arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int [] arrayInt = new int [5]; //Declaration of the array size
//        arr[0] = 125;
//        arr[1] = 225;
//        arr[2] = 421;
//        arr[4] = 24;
//        arr[3] = 12;

        String [] arrString = new String [5];
        arrString[0] = "Anant" ;
        arrString[1] = "Binod" ;
        //System.out.println(arr.length); //-> 5
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/

        for (int i = 0 ; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }

//        for (int j : arrayInt) { // for all the integer in the array arrInt
//            System.out.println(j);
//        }

//        for (String j : arrString) { // for all the String  in the array arrString
//            System.out.println(j);
//        }

        //System.out.println(Arrays.toString(arrString));


    }

}
