package example8collections;

// Generics

import java.util.*;

//<> Generics
public class ArrayListExample {

    public static void main(String[] args) {
        int [] arr = new int[5];
        ArrayList<Integer> list = new ArrayList<>(); // 10
        list.add(3); // 0
        list.add(10); //1
        list.add(5); //2
        list.add(3); //3
        //list.add(25); //4

        //list.add(2, 100); // 2

        //list.set(1, 100);

        //list.stream().toArray()
        System.out.println("Print via the toString method which will be called internally");
        System.out.println(list);
        //System.out.println(list.size());


        Integer[] arrayFromList = list.stream().toArray(Integer[]::new);

        System.out.println("Printing via for loop");
        for (int i = 0; i< arrayFromList.length; i++) {
            System.out.print(arrayFromList[i]+" ");
        }
        System.out.println();

        //list.clear();

        //System.out.println(list.indexOf(7));

//        for(int i = 0; i < list.size() ; i++) {
//            System.out.println(list.get(i));
//        }

        Iterator<Integer> itr = list.iterator();

        System.out.println("Printing via iterator");

        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

        System.out.println();

        //Wierd
        //HashSet<Integer> set = new HashSet<>();
        //new PriorityQueueExample.CustomIntegerComparator()
        //Set<Integer> set = new TreeSet<>(); //natural order
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        set.add(4);
        set.add(1);
        set.add(2);
        set.add(6);
        set.add(2);

        System.out.println("Printing via streams");
        set.stream().forEach(e -> System.out.print(e+" "));
        System.out.println();
        System.out.println("Printing via toString method which will be called internally");
        System.out.println(set);

    }

}
