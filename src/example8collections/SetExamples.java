package example8collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SetExamples {

    public static void main(String[] args) {
        //HashSet<String> hashSet = new HashSet<>();
        //LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        TreeSet<String> hashSet = new TreeSet<>();
        hashSet.add("Anant");
        hashSet.add("Zimpa");
        hashSet.add("Santhi");
        hashSet.add("Priyanka");
        hashSet.add("Dolker");


        //System.out.println(hashSet.contains("asdasda"));
        //System.out.println(hashSet.first());
       Iterator<String> itr =  hashSet.iterator();

//       while(itr.hasNext()) {
//           System.out.print(itr.next() + " ");
//       }

       hashSet.forEach(e -> System.out.println(e)); //lambda

        //System.out.println(hashSet);

    }

}
