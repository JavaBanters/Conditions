package example10;public class UnCheckedException {

    public static void main(String[] args){
        //int [] arr = new int [5];
        //arr[7] = 10;

//        int i = Integer.parseInt("anant");
//        System.out.println(i);

//        String s =  null ;
//        System.out.println(s.length());

        try {
            int [] arr = new int [5];
            arr[7] = 10;
        }  finally {
            System.out.println("this is my final block");
        }

//        try {
//            String s =  null ;
//          System.out.println(s.length());
//        } catch(NullPointerException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            int i = Integer.parseInt("anant");
//            System.out.println(i);
//        } catch(NumberFormatException e) {
//            System.out.println(e.toString());
//        }

    }

}
