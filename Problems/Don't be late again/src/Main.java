import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.next());
        String[] shops = new String[counter * 2];

        for (int i = 0; i < shops.length; i++) {
            shops[i] = scanner.next();
        }

        for (int j = 1; j < shops.length; j = j + 2) {
            if (LocalTime.of(19, 30).plusMinutes(30).isBefore(LocalTime.parse(shops[j]))) {
                System.out.println(shops[j - 1]);
            }
        }
    }
}