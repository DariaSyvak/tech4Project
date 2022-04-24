package javaMemoryManagment;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sd = new StringBuilder("John");//Johnathan
        sd.append("athan");
        System.out.println(sd);
        sd.append(123);
        System.out.println(sd);
        sd.insert(2,"$$$");
        System.out.println(sd);
        sd.reverse();
        System.out.println(sd);
    }
}
