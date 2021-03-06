package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LoopingThroughListElements {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('D');
        chars.add('A');
        chars.add('B');
        chars.add('C');

        System.out.println("My list before sort = "+ chars);
        Collections.sort(chars);
        System.out.println("My list after sort ="+ chars);

        System.out.println("______PRINTING EACH ELEMENT WITH FOR-I LOOP______");
        for (int i = 0; i < chars.size(); i++) {
            System.out.println(chars.get(i));

        }
        System.out.println("________WITH FOR EACH LOOP________");
        for (Character element : chars) {
            System.out.println(element);

        }

    }
}
