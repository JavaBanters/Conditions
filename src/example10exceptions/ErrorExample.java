package example10exceptions;public class ErrorExample {

    public static void main(String[] args){
        printIncrementedNumber(10);
    }

    private static int printIncrementedNumber(int i) {
        System.out.println(i);
        return 1 + printIncrementedNumber(i);

    }

}
