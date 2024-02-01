package example13compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareExamples {

    public static void main(String[] args){
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(34);
        ls.add(9);
        ls.add(100);
        ls.add(5);
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);
    }
}
