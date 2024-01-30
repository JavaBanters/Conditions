package example8collections;

import java.util.*;

class Address {

    int pincode;
    String number;
}

public class LinkedListExample {

    public static void main(String[] args) {
       // List
        LinkedList<String> list = new LinkedList<>();
        list.add("Anant");
        list.add("Rabin");
        list.addFirst("Shanti");
        list.addLast("Dolker");

        list.addFirst("Zimpa");

        System.out.println(list);

//        Iterator<String> itr = list.iterator();
//
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }

     //   [Zimpa, Shanti, Anant, Rabin , dolker]

//        ListIterator<String> itr1 = list.listIterator();
//
//        while(itr1.hasNext()) {
//            System.out.println(itr1.next());
//        }
//
//        System.out.println("---------------------");
//
//        while(itr1.hasPrevious()) {
//            System.out.println(itr1.previous());
//        }

    }
}
