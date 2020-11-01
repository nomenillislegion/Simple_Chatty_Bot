class User {

    private final String login;
    private final String firstName;
    private final String lastName;

    public User(String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return
                "login=" + login +
                        ",firstName=" + firstName +
                        ",lastName=" + lastName;
    }
}