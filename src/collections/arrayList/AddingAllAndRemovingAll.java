package collections.arrayList;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {


        System.out.println("___________TASK-1__________");
        ArrayList<String> germanCars = new ArrayList<>();

        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars =" + germanCars);

        System.out.println("___________TASK-2__________");
        ArrayList<String> japaneseCars = new ArrayList<>();

        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");

        System.out.println("Japanese cars =" + japaneseCars);

        System.out.println("___________TASK-2__________");
        ArrayList<String> luxuryCars = new ArrayList<>();

        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars = " + luxuryCars);

        System.out.println("______PUT ALL TOGETHER_____");
        ArrayList<String>inventory=new ArrayList<>();
        System.out.println("Inventory at the beginning = "+ inventory);

        inventory.addAll(germanCars);
        inventory.addAll(japaneseCars);

        System.out.println("After  added  german and japanese = " +inventory);

        inventory.addAll(1,luxuryCars);

        System.out.println("All added = "+ inventory);

        inventory.removeAll(japaneseCars);
        System.out.println("Inventory without Japanese car =" +inventory);

        inventory.remove("Audi");
        inventory.remove("BMW");
        inventory.remove("Tesla");

        ArrayList<String>carsTobeRemoved=new ArrayList<>();
        carsTobeRemoved.add("BMW");
        carsTobeRemoved.add("Tesla");
        System.out.println(carsTobeRemoved);




    }
}
