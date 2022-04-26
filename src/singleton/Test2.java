package singleton;

public class Test2 {
    public static void main(String[] args) {

        Driver d1=Driver.getDriver();
        Driver d2=Driver.getDriver();
        Driver d3=Driver.getDriver();
        Driver d4=Driver.getDriver();
        Driver d5=Driver.getDriver();

        for (int i = 0; i < 1000; i++) {
            System.out.println(d5);
        }
    }
}
