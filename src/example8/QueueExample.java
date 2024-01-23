package example8;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

    public static void main(String[] args) {
//        ArrayDeque<String> queue = new ArrayDeque<>();
//        queue.add("Anant");
//        queue.add("Dolker");
//        queue.add("Santhi");
//        queue.addFirst("Rabin");
//
//        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
//        priorityQueue.add("Anant");
//        priorityQueue.add("Dolker");
//        priorityQueue.add("Santhi");
//        priorityQueue.add("Rabin");

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(2);
        queue.add(1);
        queue.add(3);
        queue.addFirst(4);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(4);

        PriorityQueue<Integer> priorityQueueCustom = new PriorityQueue<>(new PriorityQueueExample.CustomIntegerComparator());
        priorityQueueCustom.add(2);
        priorityQueueCustom.add(1);
        priorityQueueCustom.add(3);
        priorityQueueCustom.add(4);

        System.out.println("Normal"+queue);
        System.out.println(priorityQueue);
        System.out.println(priorityQueueCustom);

//        System.out.println(queue.size());
//        System.out.println(queue.peek());
//        System.out.println(queue.peekLast());

    }

}
