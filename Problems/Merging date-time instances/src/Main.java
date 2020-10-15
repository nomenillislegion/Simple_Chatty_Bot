import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        // write your code here
        LocalDateTime maxLocalDateTime = dateTime1;
        if (dateTime1.getYear() >= dateTime2.getYear()) {
            maxLocalDateTime = maxLocalDateTime.withYear(dateTime1.getYear());
        } else {
            maxLocalDateTime = maxLocalDateTime.withYear(dateTime2.getYear());
        }


        if (dateTime1.getMonthValue() >= dateTime2.getMonthValue()) {
            maxLocalDateTime = maxLocalDateTime.withMonth(dateTime1.getMonthValue());
        } else {
            maxLocalDateTime = maxLocalDateTime.withMonth(dateTime2.getMonthValue());
        }


        if (dateTime1.getDayOfMonth() >= dateTime2.getDayOfMonth()) {
            maxLocalDateTime = maxLocalDateTime.withDayOfMonth(dateTime1.getDayOfMonth());
        } else {
            maxLocalDateTime = maxLocalDateTime.withDayOfMonth(dateTime2.getDayOfMonth());
        }


        if (dateTime1.getHour() >= dateTime2.getHour()) {
            maxLocalDateTime = maxLocalDateTime.withHour(dateTime1.getHour());
        } else {
            maxLocalDateTime = maxLocalDateTime.withHour(dateTime2.getHour());
        }


        if (dateTime1.getMinute() >= dateTime2.getMinute()) {
            maxLocalDateTime = maxLocalDateTime.withMinute(dateTime1.getMinute());
        } else {
            maxLocalDateTime = maxLocalDateTime.withMinute(dateTime2.getMinute()
            );
        }

        if (dateTime1.getSecond() >= dateTime2.getSecond()) {
            maxLocalDateTime = maxLocalDateTime.withSecond(dateTime1.getSecond());
        } else {
            maxLocalDateTime = maxLocalDateTime.withSecond(dateTime2.getSecond());
        }
        return maxLocalDateTime;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}