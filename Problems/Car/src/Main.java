class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        if (speed - 5 >= 0) {
            speed -= 5;
        } else if (speed - 5 < 0) {
            speed = 0;
        }
    }
}