

class Employee {


    String name;
    int salary;
    String address;

    public Employee() {
        this.name = "unknown";
        this.address = "unknown";
        this.salary = 0;
    }

    public Employee(String name, int salary) {
        this.address = "unknown";
        this.salary = salary;
        this.name = name;
    }

    public Employee(String name, int salary, String address) {
        this.address = address;
        this.salary = salary;
        this.name = name;
    }
}