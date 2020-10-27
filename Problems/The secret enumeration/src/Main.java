
public class Main {

    public static void main(String[] args) {
        Secret[] array = Secret.values();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].toString().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/