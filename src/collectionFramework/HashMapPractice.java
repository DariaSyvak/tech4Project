package collectionFramework;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {

        TreeMap<String,String> capitals=new TreeMap<>();

        capitals.put("Ukraine","Kiev");
        capitals.put("Spain","Madrid");
        capitals.put("Portugal","Lisbon");
        capitals.put("Italy","Rome");
        capitals.put("US","DC");
        capitals.put("Canada","Ottawa");


        System.out.println(capitals);//{Canada=Ottawa, Ukraine=Kiev, Italy=Rome, Portugal=Lisbon, US=DC, Spain=Madrid}
        System.out.println(capitals.get("Spain"));

        System.out.println("___________Understanding HASHMAP__________");
        HashMap<Integer,String>student=new HashMap<>();
        student.put(1,"Alona");
        student.put(2,"Abdullah");
        student.put(3,"Abdullah");
        student.put(4,"Data");
        student.put(null,"John");
        student.put(null,"Alex");//will replace John with Alex





        System.out.println(student.size());
        System.out.println(student);


    }
}
