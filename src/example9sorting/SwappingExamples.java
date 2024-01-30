package example9sorting;

public class SwappingExamples {

    public static void main(String[] args){

        int a = 10; //T
        int b = 20;  // C
        System.out.println(a + " " + b);

        swapNumbers(a,b); //is java pass by value or pass by reference
//        int c = b;
//        b = a;
//        a = c;

        System.out.println(a + " " + b);



     }

    private static void swapNumbers(int a, int b) {
        int c = b;
        b = a;
        a = c;
    }

}
