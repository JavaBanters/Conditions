package example10exceptions;


/*try {

    } catch ("type of exception to be handled") {

    } finally {

    }*/
//two types of exceptions Unchecked/runtime and checked/compiletime
public class BasicExceptionExample {


    public static void divideNumber(int value) throws ArithmeticException{

            actualCalculation(value);


        System.out.println("The answer");
    }

    public static void actualCalculation(int value) throws ArithmeticException{
            int result = value / 0 ;
    }

    public static void main(String[] args){

//        try {
//            int i = 10 / 0 ;
//        } catch(ArithmeticException e) {
//            System.out.println("Cannot divide by zero. Try another number");
//        }


        try {
           divideNumber(20);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero. Handled by main block");
        }

        //int i = 10 / 0;

        System.out.println("This is the end ");
    }

}
