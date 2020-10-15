import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        LocalDateTime ldtFinal = LocalDateTime.parse(scanner.next());
        for (int i = 1; i < counter; i++) {
            LocalDateTime ldt1 = LocalDateTime.parse(scanner.next());
            if (ldt1.isAfter(ldtFinal)) {
                ldtFinal = ldt1;
            }
        }
        System.out.println(ldtFinal);
    }
}