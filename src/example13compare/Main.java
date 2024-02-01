package example13compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){
        Student s1 = new Student("Binod", 1234, 60.5f);
        Student s2 = new Student("Tom", 2341, 50.5f);
        Student s3 = new Student("Daniel", 1345, 65.5f);
        Student s4 = new Student("Sam", 1111, 80.5f);
        Student s5 = new Student("Aarathi", 2314, 45.5f);

        ArrayList<Student> ls = new ArrayList<>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);
        ls.add(s5);

        System.out.println(ls);
        Collections.sort(ls);

        System.out.println(ls);//example13compare.Student@36baf30c
        //System.out.println(s1.toString());



        //Example of Anonymous class

        FunctionInterfaceExample functionInterfaceExample = new FunctionInterfaceExample() {
            @Override
            public void print() {
                System.out.println("Hello print");
            }

//            @Override
//            public void display() {
//                System.out.println("Hello Display");
//            }
        };

        //functionInterfaceExample.display();
        functionInterfaceExample.print();

    }

}
