package example10;public class MultipleExceptions {

    public static void main(String[] args){

//        try {
//            //int [] arr = new int [5];
//            //arr[7] = 10;
//
//            //int i = Integer.parseInt("anant");
//            //System.out.println(i);
//
//            String s =  null ;
//            System.out.println(s.length());
//        } catch (NumberFormatException  | ArrayIndexOutOfBoundsException | NullPointerException e) {
//            System.out.println(e.getMessage());
//        }


        try {
            int [] arr = new int [5];
            arr[7] = 10;

            //int i = Integer.parseInt("anant");
            //System.out.println(i);

            //String s =  null ;
            //System.out.println(s.length());
        } catch (NumberFormatException  e) {
            System.out.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException  e) {
            System.out.println(e.getMessage());
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }



    }

}
