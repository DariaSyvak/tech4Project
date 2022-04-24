package collections.linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ExerciseO1 {
    public static void main(String[] args) {

        String[] cities = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};
        List<String> citiesS = new ArrayList<>(Arrays.asList(cities));
        System.out.println(citiesS);
        citiesS.removeIf(element->element.equals("Dallas"));//remove all Dallas
        citiesS.remove("Miami");
        citiesS.remove("Dallas");
        System.out.println(citiesS);

    }
}
