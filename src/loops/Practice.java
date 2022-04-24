package loops;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (!(i % 2 == 0 || i % 3 == 0)) System.out.println(i);
        }

        //while loop

        int start = 1;
        while (start < 101) {
            if (start % 2 != 0 && start % 3 != 0) System.out.println(start);
            start++;
        }
        //do while loop
        int count = 1;
        do {
            if (count % 2 != 0 && count % 3 != 0) System.out.println(count);
            count++;
        } while (count <= 100);


        String[] cats = {"Garfield", "Garfield", "Garfield", "Garfield"};
        System.out.println(Arrays.toString(cats));

        boolean bool = false;boolean bool2 = false;
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].equalsIgnoreCase("Garfield"))
                bool=true;
            else if (cats[i].equalsIgnoreCase("Felix"))
                bool2=true;
        }
        System.out.println(bool2&&bool);

    }
}
