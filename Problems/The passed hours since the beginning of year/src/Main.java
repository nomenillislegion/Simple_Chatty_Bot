import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime ldt = LocalDateTime.parse(scanner.nextLine());

        System.out.println(Math.abs(Duration.between(LocalDateTime.of(2017, 1, 1, 0, 0, 0), ldt).toHours()));
    }
}