package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {

        for (int i = 1; i <= 25; i++) {
            if (i % 10 != 0) {
                System.out.println(i);
            }
            if (i == 15) {
                break;

            }
        }
        //continue method

        for (int i = 1; i <= 25; i++) {
            if (i % 10 == 0) continue;
            else System.out.println(i);
            if (i==15)break;

        }


    }

}
