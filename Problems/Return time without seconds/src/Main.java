import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalTime inputTime = LocalTime.parse(scanner.nextLine());
        LocalTime outputTime = inputTime.withSecond(0);
        System.out.println(outputTime);
    }
}