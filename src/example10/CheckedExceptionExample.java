package example10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

// FileNotFound and IOException
public class CheckedExceptionExample {

    public static void main(String[] args) throws Exception {
        FileReader fr = null;
        try {
             fr = new FileReader("abc.txt"); //change the file name to random
            int i;
            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("THis file doesn't exists");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        } finally {
            fr.close();
        }

//        FileReader fr = new FileReader("abc.txt"); //change the file name to random
//            int i;
//            while((i = fr.read()) != -1) {
//                System.out.print((char)i);
//            }

        //new syntax (try with resource
        try (FileReader fr1 = new FileReader("abc.txt")) {
            int i;
            while((i = fr1.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("THis file doesn't exists");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

}
