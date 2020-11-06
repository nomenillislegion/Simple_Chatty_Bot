import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = new StringReverser() {
            String reversed = "";

            public String reverse(String str) {
                for (int i = str.length() - 1; i >= 0; i--) {
                    reversed += str.charAt(i);
                }
                return reversed;
            }
        }; /* create an instance of an anonymous class here,
                                     do not forget ; on the end */

        System.out.println(reverser.reverse(line));
    }

    interface StringReverser {

        String reverse(String str);
    }

}