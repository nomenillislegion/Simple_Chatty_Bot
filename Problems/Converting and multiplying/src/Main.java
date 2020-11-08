import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            if (scanner.hasNextLine()) {
                input = scanner.nextLine();
                if (!input.equals("0")) {
                    try {
                        System.out.print(Integer.parseInt(input) * 10);
                    } catch (Exception e) {
                        System.out.print("Invalid user input: " + input);
                    }
                    System.out.println();
                } else {
                    break;
                }
            } else {
                break;
            }
        } while (!input.equals("0"));
    }
}