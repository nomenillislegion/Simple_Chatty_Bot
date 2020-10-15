import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        LocalTime inputTime1 = LocalTime.parse(scanner.nextLine());
        LocalTime inputTime2 = LocalTime.parse(scanner.nextLine());
        if (inputTime1.toSecondOfDay() >= inputTime2.toSecondOfDay()) {
            System.out.println(inputTime1.toSecondOfDay() - inputTime2.toSecondOfDay());
        } else {
            System.out.println(inputTime2.toSecondOfDay() - inputTime1.toSecondOfDay());

        }
    }
}