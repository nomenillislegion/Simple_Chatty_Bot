class Problem {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")) {
                System.out.println(i);
                counter = 1;
                break;
            }
        }
        if (counter != 1) {
            System.out.println(-1);
        }
    }
}