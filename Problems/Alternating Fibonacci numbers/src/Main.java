import java.util.Scanner;

public class Main {

    public static long fib(long n) {
        // write your code here
        int n1 = 0, n2 = 1, n3;

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        for (int i = 2; i < n; ++i) {
            n3 = n1 - n2;
            n1 = n2;
            n2 = n3;
        }
        return n1 - n2;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}