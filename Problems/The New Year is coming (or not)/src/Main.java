import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate ld = LocalDate.parse(scanner.next());
        int days = scanner.nextInt();
        System.out.println(ld.plusDays(days).isEqual(ld.withYear(ld.getYear() + 1).withMonth(1).withDayOfMonth(1)));
    }
}