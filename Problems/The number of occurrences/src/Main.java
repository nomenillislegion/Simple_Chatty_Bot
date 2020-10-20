import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int count(int[] numbers, int value) {
        // write your code here
        int counter = 0;
        if (numbers == null) {
            return -1;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == value) {
                    counter++;
                }
            }
            return counter;
        }
    }

    /* Do not change code below */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] numbers;
        final int k;
        if (scanner.hasNextInt()) {
            numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            k = Integer.parseInt(scanner.nextLine());
        } else {
            numbers = new int[0];
            k = 10;
        }
        System.out.println(count(numbers, k));
    }
}