package javaMemoryManagment;

public class UnderstandingMutability {
    public static void main(String[] args) {
        String city="Chicago";
        String address="Chicago";
        System.out.println(city.equals(address));//proper
        System.out.println(city==address);//not proper

        city="Miami";
        System.out.println(city);
        System.out.println(address);
    }
}
