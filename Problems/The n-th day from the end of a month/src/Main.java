import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int mymounth = scanner.nextInt();
        int n = scanner.nextInt();
        LocalDate date = LocalDate.now().withYear(year).withMonth(mymounth).withDayOfMonth(20);
        int maxday = date.lengthOfMonth();
        LocalDate datelast = LocalDate.now().withYear(year).withMonth(mymounth).withDayOfMonth(maxday - n + 1);
        System.out.println(datelast);
    }
}