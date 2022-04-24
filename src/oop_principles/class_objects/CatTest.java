package oop_principles.class_objects;

public class CatTest {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.name="Kiwi";
        cat.color="Brown";
        cat.age=2;
        cat.animal="Cat";

        Cat cat2=new Cat("Cat","Kiwi",2,"Brown");
        System.out.println(cat2);

        Cat cat3=new Cat();
        cat3.name="Kiwi";
        cat3.catIsWalking();
        cat3.catIsWalking(cat3.name);









    }

}
