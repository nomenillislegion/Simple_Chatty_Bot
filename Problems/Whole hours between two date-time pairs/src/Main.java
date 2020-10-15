import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime input1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime input2 = LocalDateTime.parse(scanner.nextLine());
        LocalTime time1 = input1.toLocalTime();
        LocalTime time2 = input2.toLocalTime();
        LocalDate date1 = input1.toLocalDate();
        LocalDate date2 = input2.toLocalDate();
        ZoneOffset zone = ZoneOffset.of("Z");
        long epoch1 = time1.toEpochSecond(date1, zone);
        long epoch2 = time2.toEpochSecond(date2, zone);
        long differenceInHorse = (epoch1 - epoch2) / 3600;
        System.out.println(Math.abs(differenceInHorse));


    }
}