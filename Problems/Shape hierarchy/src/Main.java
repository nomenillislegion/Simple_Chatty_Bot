abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt((s * (s - a) * (s - b) * (s - c)));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }
}

class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return a + a + b + b;
    }

    @Override
    double getArea() {
        return a * b;
    }
}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return Math.pow(r, 2) * Math.PI;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }
}

