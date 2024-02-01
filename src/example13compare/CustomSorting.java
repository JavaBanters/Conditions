package example13compare;

import java.util.Comparator;

public class CustomSorting implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        if(s1.rollNo > s2.rollNo){
            return 1;
        }
        else if(s1.rollNo< s2.rollNo) {
            return -1;
        }
        return 0;
    }
}
