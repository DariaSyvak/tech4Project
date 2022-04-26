package recursion;

public class _01_SumOfNumbers {

    public static int sumOfNum(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            c += i;

        }
        return (c);
    }

    public static int recursiveSum(int n) {
        if (n > 0) return n + recursiveSum(n - 1);
        return 0;
    }


    public static void main(String[] args) {

        System.out.println(sumOfNum(5));
        System.out.println(recursiveSum(4));
    }

}


