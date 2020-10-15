import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int month = scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        System.out.print(date + " ");
        // put your code here
        System.out.println(date.withDayOfMonth(date.lengthOfMonth()));
    }
}