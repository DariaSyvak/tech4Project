package arrays;

import java.util.Arrays;

public class _05_PracticeSearchingInArray {
    public static void main(String[] args) {

        System.out.println("___________Task-1__________");
        String[]objects={"Remote","Mikey Mouse","Mikey Mouse","Keyboard","IPad"};
        boolean mouse=false;
        for (String ob : objects) {
            if (ob.equalsIgnoreCase("Mouse")) {
                mouse= true;
                break;
            }
        }
        System.out.println(mouse);


        System.out.println("___________Task-2__________");
        boolean board=false;
        for (String ob : objects) {
            if (ob.equalsIgnoreCase("board")) {
                board= true;
                break;
            }
        }
        System.out.println(board);

        System.out.println("\n--------TASK-3---------\n");

        Arrays.sort(objects); // My array is sorted "Keyboard", "Mouse","Mouse", "Remote", "iPad"
        //                       0         1       2        3       4

        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Apple") >= 0); // false
        System.out.println(Arrays.binarySearch(objects, "Keyboard") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Key") >= 0); // false



        System.out.println("___________Task-4___________");
        int[]num={5, -2, 0, -7, 0, 5, 8, 45, 53};

        Arrays.sort(num);
        System.out.println(Arrays.binarySearch(num,5)>=0);
        System.out.println(Arrays.binarySearch(num,0)>=0);
        System.out.println(Arrays.binarySearch(num,45)>=0);
        System.out.println(Arrays.binarySearch(num,3)>=0);
        System.out.println(Arrays.binarySearch(num,-7)>=0);






    }
}
