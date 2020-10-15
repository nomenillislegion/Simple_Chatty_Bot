import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalTime ltStartRange1 = LocalTime.parse(scanner.next());
        LocalTime ltFinalRange1 = LocalTime.parse(scanner.next());
        LocalTime ltStartRange2 = LocalTime.parse(scanner.next());
        LocalTime ltFinalRange2 = LocalTime.parse(scanner.next());
        if (ltStartRange1.equals(ltStartRange2)
                || ltStartRange1.equals(ltFinalRange2)
                || ltFinalRange1.equals(ltStartRange2)
                || ltFinalRange1.equals(ltFinalRange2)) {
            System.out.println("true");
        } else if ((ltStartRange1.isBefore(ltFinalRange2)
                && ltStartRange1.isAfter(ltStartRange2))
                || (ltStartRange2.isBefore(ltFinalRange1)
                && ltStartRange2.isAfter(ltStartRange1))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}