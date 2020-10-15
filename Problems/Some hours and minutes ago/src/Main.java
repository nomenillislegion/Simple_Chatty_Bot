import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime inputTime = LocalTime.parse(scanner.nextLine());
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        System.out.println(inputTime.minusHours(hours).minusMinutes(minutes));

        // put your code here
    }
}