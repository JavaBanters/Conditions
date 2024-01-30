package example8collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zimpa");
        stack.push("Dolker");
        stack.push("Santhi");
        stack.push("Anant");
        stack.add("Rabin");
        //stack.pop();
        //stack.pop();
        //stack.pop();

        //System.out.println(stack.size());
        //System.out.println(stack.isEmpty());


        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }

        System.out.println("-------------------");

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }

        System.out.println("------######-------");

        Iterator<String> itr = stack.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next().toUpperCase());
        }

//        while(!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

        //System.out.println(stack.peek());

        //System.out.println(stack);
    }

}
