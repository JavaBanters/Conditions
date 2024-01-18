package example8;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

//Thread safe

//Enumerator , Iterator, List Iterator
public class VectorExample {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(4);
        vector.add(0,3);


        //System.out.println(vector);

        Enumeration<Integer> itr = Collections.enumeration(vector);

        while (itr.hasMoreElements()) {
            System.out.println(itr.nextElement());
        }

    }

}
