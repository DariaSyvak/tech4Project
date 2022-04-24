package javaMemoryManagment;

public class GarbageCollection {
    public static void main(String[] args) {

        Dog dog1=new Dog();
        Dog dog2=new Dog();

        System.out.println("__________object before losing reference_________ ");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog1.equals(dog2));
        System.out.println("__________object after losing reference___________");
        dog1=dog2;
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog1.equals(dog2));



    }
}
