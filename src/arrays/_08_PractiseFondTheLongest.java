package arrays;

public class _08_PractiseFondTheLongest {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "white"};

/*
Find the string that has the most characters and print it

RESULT:
yellow
 */
        String longest="";// or color[0];
        for (String color : colors) {
            if(color.length()>longest.length())longest=color;

        }
        System.out.println(longest);
    }
}
