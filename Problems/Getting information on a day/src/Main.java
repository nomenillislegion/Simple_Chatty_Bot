import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scanner.nextLine());
        int output1 = date.getDayOfYear();
        int output2 = date.getDayOfMonth();
        System.out.println(output1 + " " + output2);
        // put your code here
    }
}