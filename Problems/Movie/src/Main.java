class Movie {
    private final String title;
    private final String desc;
    private final int year;

    public Movie(String title, String desc, int year) {
        this.desc = desc;
        this.title = title;
        this.year = year;
    }

    public Movie(String title, int year) {
        this.year = year;
        this.title = title;
        this.desc = "empty";
    }
    // write two constructors here

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }
}