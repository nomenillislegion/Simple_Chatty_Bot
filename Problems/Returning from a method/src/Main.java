class Create {


    public static Runnable createRunnable(String text, int repeats) {
        Runnable instance = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= repeats; i++) {
                    System.out.println(text);
                }
            }
        };
        return instance;// an instance here
    }
}

