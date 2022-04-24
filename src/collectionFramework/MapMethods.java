package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {
    public static void main(String[] args) {
        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

        Set<String> keys = favorites.keySet();
        System.out.println(keys);
        Collection<String> values = favorites.values();
        System.out.println(values);

        System.out.println(values.stream().filter(element -> element.length() > 5).count());
        System.out.println(keys.stream().filter(element -> element.toLowerCase().startsWith("c")).count());

        Set<Map.Entry<String, String>> entries = favorites.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println("My favorite " + entry.getKey() + " is = " + entry.getValue());
        }

    }
}
