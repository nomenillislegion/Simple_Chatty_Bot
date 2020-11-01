class Book {

    private final String title;
    private final int yearOfPublishing;
    private final String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    @Override
    public String toString() {

        return
                "title=" + title +
                        ",yearOfPublishing=" + yearOfPublishing +
                        ",authors=[" + String.join(",", authors) + "]";
    }
}