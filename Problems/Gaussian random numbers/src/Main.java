
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();
        long N = scanner.nextLong();
        double M = scanner.nextDouble();

        Random random = new Random(K);
        int i = 0;

        do {
            if (random.nextGaussian() > M) {
                random.setSeed(++K);
                i = -1;
            }
            ++i;
        } while (i < N);
        System.out.println(K);
    }
}