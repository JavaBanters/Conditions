package example8;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Anant");
        list.add("Rabin");
        list.addFirst("Shanti");
        list.addLast("Dolker");

        //System.out.println(list.size());

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
