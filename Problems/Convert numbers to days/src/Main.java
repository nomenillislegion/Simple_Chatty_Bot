import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day1 = scanner.nextInt();
        int day2 = scanner.nextInt();
        int day3 = scanner.nextInt();
        LocalDate date = LocalDate.ofYearDay(year, day1);
        System.out.println(date);
        date = date.withDayOfYear(day2);
        System.out.println(date);
        date = date.withDayOfYear(day3);
        System.out.println(date);
        // put your code here
    }
}