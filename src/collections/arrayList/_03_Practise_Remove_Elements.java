package collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _03_Practise_Remove_Elements {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        System.out.println(languages);

        languages.remove("Python");
        System.out.println(languages);

        System.out.println("TASK-2");
        List<String> startWithJ = new LinkedList<>();
        for (String language : languages) {
            if(language.startsWith("J"))startWithJ.add(language);
        }

        languages.removeAll(startWithJ);
        System.out.println(languages);


        //fast-way(REMOVE IF METHOD)//BEST WAY
        languages.removeIf(language->language.startsWith("J"));
        System.out.println(languages);


        //USING ITERATOR
        Iterator<String>iterator=languages.iterator();
       while( iterator.hasNext()){
           String element= iterator.next();
           if(element.startsWith("J"))iterator.remove();
       }
        System.out.println(languages);

    }
}