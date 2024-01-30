package example8collections;

import java.util.*;

//-> key - value pairs
//For eg "empName":"empId"
public class MapExamples {

    public static void main(String[] args) {
        //HashMap<String,Integer> hashMap = new HashMap<>();
        //LinkedHashMap<String,Integer> hashMap = new LinkedHashMap<>();
        TreeMap<String,Integer> hashMap = new TreeMap<>();
        hashMap.put("Anant",12466); // logic such that [0-4]
        hashMap.put("Dolker",23234);
        hashMap.put("Zimpa",346);
        hashMap.put("Santhi",764);
        hashMap.put("Priyanka",345);
        System.out.println(hashMap);

        //Set<Map.Entry<String,Integer>> set =  hashMap.entrySet();

       for(Map.Entry<String,Integer> set : hashMap.entrySet()) {
           System.out.println(set.getKey()+" "+set.getValue());
       }


    }

}
