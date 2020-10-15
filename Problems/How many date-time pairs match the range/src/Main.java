import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime ldtInput1 = LocalDateTime.parse(scanner.next());
        LocalDateTime ldtInput2 = LocalDateTime.parse(scanner.next());
        LocalDateTime ldtStart;
        LocalDateTime ldtFinal;
        if (ldtInput1.isBefore(ldtInput2)) {
            ldtStart = ldtInput1;
            ldtFinal = ldtInput2;
        } else {
            ldtStart = ldtInput2;
            ldtFinal = ldtInput1;
        }
        int cycleTimes = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= cycleTimes; i++) {
            LocalDateTime ldt1 = LocalDateTime.parse(scanner.next());
            if ((ldt1.isAfter(ldtStart) || ldt1.isEqual(ldtStart)) && ldt1.isBefore(ldtFinal)) {
                counter++;
            } else if (ldtStart.isEqual(ldtFinal)) {
                counter = 0;
                break;
            }
        }
        System.out.println(counter);
    }
}