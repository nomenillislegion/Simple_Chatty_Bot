import java.math.BigInteger;
import java.util.Scanner;

class DoubleFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calcDoubleFactorial(n));
    }

    public static BigInteger calcDoubleFactorial(int n) {
        // type your java code here
        BigInteger bigInteger = new BigInteger("1");
        for (int i = n; i > 0; i = i - 2) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }
}