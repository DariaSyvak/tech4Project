package exceptions;

public class Example_03CheckedException {

    public static void main(String[] args) throws InterruptedException {
//
//        try {
//            for (int i = 0; i < 10; i++) {
//                Thread.sleep(2000);
//                System.out.println(i);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//}
        for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println(i);
    }
        Thread.sleep(3000);
        System.out.println("End of program");


    }
}