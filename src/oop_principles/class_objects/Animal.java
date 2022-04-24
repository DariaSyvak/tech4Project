package oop_principles.class_objects;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Animal {
    //default
    public Animal() {

    }

    //create a custom constructor that take 6 arguments
    public Animal(String name, int age, String color, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {
        //I should assign these local variables to  instance variable
        this.name = name;
        this.age = age;
        this.color = color;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
        this.isOmnivore = isOmnivore;

    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;

    }


    //fields
    public static int counterAnimals = 0;
    public static final boolean HAS_EYES = true;
    public String name;
    public String color;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    @Override
    public String toString() {
        String s = "Animal{";
        if (name != null) s += "name='" + name + '\'';
        if (color != null) s += ", color='" + color + '\'';
        if (age != 0) s += ", age=" + age;
        if (isCarnivore) s += ", isCarnivore=" + isCarnivore;
        if (isHerbivore) s += ", isHerbivore=" + isHerbivore;
        if (isOmnivore) s += ", isOmnivore=" + isOmnivore;
        s += '}';
        return s;
    }

    public static void main(String[] args) {

//        Animal a1 = new Animal();
//        counterAnimals++;
//        Animal a2 = new Animal();
//        counterAnimals++;
//        System.out.println(Animal.HAS_EYES);
//        System.out.println(counterAnimals + " times Animal object created");

        Animal a1 = new Animal("Cow", 3, "Black", false, true, false);
        System.out.println(a1);

        Animal a2 = new Animal("Cat", 1, "Grey", false, false, true);
        System.out.println(a2);

        //Animal a3=new Animal("Dog","Black");
        //System.out.println(a3);
        //Animal a4=new Animal("Cat",2,"black",true,false,false);
        //System.out.println(a4);

        Animal a3 = new Animal("Parrot", 2, "White", false, true, false);
        System.out.println(a3);
        Animal a4 = new Animal("Lion", 4, "Beige", true, false, false);
        System.out.println(a4);


        List<Animal> animalList = new ArrayList<>();
        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);
        animalList.add(a4);

        //int h = 0, c = 0, o = 0;
       /* for (Animal animal : animalList) {
            if (animal.isHerbivore) h++;
            else if (animal.isOmnivore) o++;
            else c++;
            }

        */
        int h=(int)animalList.stream().filter(animal -> animal.isHerbivore).count();
        int o=(int)animalList.stream().filter(animal -> animal.isOmnivore).count();
        int c=(int)animalList.stream().filter(animal -> animal.isCarnivore).count();

        System.out.println("Herbivore = " + h + "\n" +
                "Carnivore = " + c + "\n" +
                "Omnivore = " + o);


    }


}

