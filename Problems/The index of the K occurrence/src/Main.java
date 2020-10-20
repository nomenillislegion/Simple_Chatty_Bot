import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int searchIndexOfKOccurrence(int[] numbers, int value, int k) {
        // write your code here
        int index = -1;
        int counter = 0;
        if (numbers == null) {
            return -1;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == value) {
                    counter++;
                    if (counter == k) {
                        index = i;
                    }
                }
            }
            return index;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] numbers;
        final int k;
        final int value;
        if (scanner.hasNextInt()) {
            numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            value = Integer.parseInt(scanner.nextLine());
            k = Integer.parseInt(scanner.nextLine());
        } else {
            numbers = new int[0];
            value = 0;
            k = 1;
        }
        System.out.println(searchIndexOfKOccurrence(numbers, value, k));
    }
}