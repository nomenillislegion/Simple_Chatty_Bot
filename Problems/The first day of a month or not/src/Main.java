import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate date = LocalDate.ofYearDay(year, day);
        if (date.getDayOfMonth() == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}