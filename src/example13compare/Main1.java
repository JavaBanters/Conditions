package example13compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main1 {

    public static void main(String[] args){
        Student1 s1 = new Student1("Binod", 1234, 60.5f);
        Student1 s2 = new Student1("Tom", 2341, 50.5f);
        Student1 s3 = new Student1("Daniel", 1345, 65.5f);
        Student1 s4 = new Student1("Sam", 1111, 80.5f);
        Student1 s5 = new Student1("Aarathi", 2314, 45.5f);
        ArrayList<Student1> ls = new ArrayList<>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);
        ls.add(s5);
        System.out.println(ls);
        CustomSorting cs = new CustomSorting();
        //Collections.sort(ls, cs);
        //System.out.println(ls);

//        Comparator<Student1> cs2 = new Comparator<Student1>() {
//            @Override
//            public int compare(Student1 s1, Student1 s2) {
//                if(s1.weight > s2.weight){
//                    return 1;
//                }
//                else if(s1.weight< s2.weight) {
//                    return -1;
//                }
//                return 0;
//            }
//        };

        Comparator<Student1> cs2 = (Student1 student1, Student1 student2) -> {
                if(student1.weight > student2.weight) return 1;
                else if(student1.weight< student2.weight) return -1;
                return 0;
        };

        Comparator<Student1> cs3 = (Student1 student1, Student1 student2) -> {
            if(student1.rollNo > student2.rollNo) return 1;
            else if(student1.rollNo< student2.rollNo) return -1;
            return 0;
        };

        Collections.sort(ls, cs3.reversed());
        System.out.println(ls);



    }

}
