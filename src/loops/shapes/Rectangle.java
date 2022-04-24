package loops.shapes;

public class Rectangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            if (i == 1 || i == 8) System.out.println("* * * * * *");
            else System.out.println("*         *");

        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();



        }
    }
}