import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        LocalDateTime ldt = LocalDateTime.parse(sc.next());
        System.out.println(ldt.plusDays(sc.nextLong()).minusHours(sc.nextLong()));
    }
}