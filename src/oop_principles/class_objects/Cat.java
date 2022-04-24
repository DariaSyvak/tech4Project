package oop_principles.class_objects;

public class Cat {

    public Cat() {
    }

    public String animal;
    public String name;
    public int age;
    public String color;
    public static boolean hasTail;

    public Cat(String animal, String name, int age, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.animal = animal;
    }

    public void catIsWalking() {
        System.out.println(this.name +" is walking");
    }

    public void catIsWalking(String name) {
        System.out.println(name + " is walking");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "animal='" + animal + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

