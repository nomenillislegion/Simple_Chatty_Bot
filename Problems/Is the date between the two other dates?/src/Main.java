import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scanner.next());
        LocalDate dateStart = LocalDate.parse(scanner.next());
        LocalDate dateFinal = LocalDate.parse(scanner.next());
        LocalDate temp = LocalDate.now();
        if (dateStart.isAfter(dateFinal)) {
            temp = dateStart;
            dateStart = dateFinal;
            dateFinal = temp;
        }

        System.out.println(date.isAfter(dateStart) && date.isBefore(dateFinal));

    }
}