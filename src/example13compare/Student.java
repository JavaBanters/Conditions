package example13compare;

public class Student implements Comparable<Student>{

    String name;
    int rollNo;
    float weight;

    public Student(String name, int rollNo, float weight) {
        this.name = name; //s1
        this.rollNo = rollNo;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student[" +
                "name=" + name + "" +
                ", rollNo=" + rollNo +
                ", weight=" + weight +
                ']';
    }

//    @Override
//    public int compareTo(Student s1) {
//            if(this.weight > s1.weight) return -1;
//            else if (this.weight < s1.weight) return 1;
//            return 0;
//    }

//    @Override
//    public int compareTo(Student s1) {
//        if(this.rollNo > s1.rollNo) return -1;
//        else if (this.rollNo < s1.rollNo) return 1;
//        return 0;
//    }

    @Override
    public int compareTo(Student s1) {
        return this.name.compareTo(s1.name);
    }


}
