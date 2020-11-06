import java.util.List;

class Sort {
    public static void sortShapes(Shape[] array,
                                  List<Shape> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle> circles) {
        // write your code here
        for (Shape instance : array) {
            if (instance.getClass() == Polygon.class) {
                polygons.add((Polygon) instance);
            } else if (instance.getClass() == Square.class) {
                squares.add((Square) instance);
            } else if (instance.getClass() == Circle.class) {
                circles.add((Circle) instance);
            } else {
                shapes.add(instance);
            }
        }
    }
}

//Don't change classes below
class Shape {
}

class Polygon extends Shape {
}

class Square extends Polygon {
}

class Circle extends Shape {
}