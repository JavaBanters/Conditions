package example9sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(24);
        al.add(21);
        al.add(20);
        al.add(29);
        al.add(10);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }

}
