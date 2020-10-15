import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime inputTime = LocalDateTime.parse(scanner.nextLine());
        int addHours = scanner.nextInt();
        int addMinutes = scanner.nextInt();
        LocalDateTime outputTime = inputTime.minusHours(addHours).plusMinutes(addMinutes);
        // put your code here
        System.out.println(outputTime);
    }
}