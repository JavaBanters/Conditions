package example10exceptions;

class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }

}

public class CustomException {

    public static void main(String[] args)  {
        try {
            printValue(-10);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("customized message");
        }
        finally{
            System.out.println("this is my finally block");
        }
        //printValue(-10);
    }

    private static void printValue(int i) throws MyException {

        if(i < 0) {
            throw new MyException("The value should be more than 0");
        }
        System.out.println(i);

    }


}
