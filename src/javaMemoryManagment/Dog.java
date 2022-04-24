package javaMemoryManagment;

public class Dog {

    public String bread;

    protected void finalize(){
        System.out.println("A dog object is a garbage collection");
    }

}
