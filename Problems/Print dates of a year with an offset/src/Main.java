import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate startDate = LocalDate.parse(scanner.nextLine());
        int n = scanner.nextInt();
        int counter = 0;
        for (counter = startDate.getDayOfYear(); counter <= 365; counter = counter + n) {
            System.out.println(startDate.withDayOfYear(counter));
        }
        // put your code here
    }
}