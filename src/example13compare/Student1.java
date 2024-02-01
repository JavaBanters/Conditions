package example13compare;
public class Student1 {

    String name;
    int rollNo;
    float weight;

    public Student1(String name, int rollNo, float weight) {
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

}
