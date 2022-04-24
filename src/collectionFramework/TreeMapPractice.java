package collectionFramework;

import java.util.Hashtable;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        TreeMap<String,Integer>studentAge=new TreeMap<>();
        studentAge.put("Kally",17);
        studentAge.put("Torrie",20);
        studentAge.put("Alona",15);
        studentAge.put("Andrei",25);
        //studentAge.put(null,15);
        studentAge.put("Guluzar",null);
        studentAge.put("Melda",null);
        studentAge.put("Taylor",null);

        System.out.println(studentAge);

    }
}
