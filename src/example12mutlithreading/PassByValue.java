package example12mutlithreading;

class Student {
    int rollNo;
    String name;


}

public class PassByValue {

    public static void main(String[] args){
        int a = 10;
        int b = 20;
//        int c ;
//        c = a ;
//        a = b;
//        b = c;

//        swapNumbers(a,b);
//
//        System.out.println("a=>" + a);
//        System.out.println("b=>" + b);

        Student student1 = new Student();
        student1.name = "Anant";
        student1.rollNo = 10;

        Student student2;

        System.out.println(student1.name);
        System.out.println(student1.rollNo);

        student2 = student1;

        student2.name = "Binod";
        student2.rollNo = 30;

        swapValue(student1);

        System.out.println(student1.name);
        System.out.println(student1.rollNo);

    }

    private static void swapValue(Student s) {
            Student s2;
            s2 = s;
            s2.name = "Tara";
            s2.rollNo = 50;
    }

    private static void swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
