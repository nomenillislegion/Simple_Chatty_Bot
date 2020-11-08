// do not change the interface
interface Measurable {
    double square();
}

class Circle implements Measurable {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
