import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int mounth = scanner.nextInt();
        LocalDate date = LocalDate.of(year, mounth, 1);
        for (int i = 1; i <= date.lengthOfMonth(); i++) {
            LocalDate dateFinal = LocalDate.of(year, mounth, i);
            if (dateFinal.getDayOfWeek().toString().equals("MONDAY")) {
                System.out.println(dateFinal);
            }
        }
        // put your code here
    }
}