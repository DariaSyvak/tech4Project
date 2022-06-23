package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {
    //Task-1
    public static Map<Integer, String> parseData(String data) {
        TreeMap<Integer, String> map = new TreeMap<>();
        String s = data.replaceAll("[{]", " ");
        for (String x : s.split(" ")) {
            System.out.println(x);
            if (!x.isEmpty()) map.put(Integer.valueOf(x.substring(0, x.indexOf("}")))
                    , x.substring(x.indexOf("}") + 1));
        }

        return map;
    }

    //Task-2
    public static double calculateTotalPrice1(Map<String, Integer> grocery) {
        Map<String, Double> priceList = new HashMap<>();
        double total = 0;
        priceList.put("Apple", 2.00);
        priceList.put("Orange", 3.29);
        priceList.put("Mango", 4.99);
        priceList.put("Pineapple", 5.25);
        for (String product : grocery.keySet()) {
            for (int i = 0; i < grocery.get(product); i++) {
                System.out.println(grocery.get(product));
                total += priceList.get(product);
            }
        }
        return (double) Math.round(total * 100) / 100;
    }

    public static double calculateTotalPrice2(Map<String, Integer> grocery) {
        Map<String, Double> priceList = new HashMap<>();
        double total = 0;

        priceList.put("Apple", 2.00);
        priceList.put("Orange", 3.29);
        priceList.put("Mango", 4.99);
        for (String product : grocery.keySet()) {
            for (int i = 1; i < grocery.get(product) + 1; i++) {
                if (product.equals("Mango") && i % 4 == 0) continue;
                else if (product.equals("Apple") && i % 2 == 0) total += priceList.get(product) / 2;
                else total += priceList.get(product);

            }


        }
        return (double) Math.round(total * 100) / 100;
    }


    public static void main(String[] args) {
        Map<String, Integer> shopList = new HashMap<>();
        shopList.put("Apple", 4);
        shopList.put("Mango", 8);
        shopList.put("Orange", 3);
        System.out.println(calculateTotalPrice2(shopList));
    }
}
