import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int length = scanner.nextInt();

        GeometricCuboid cuboid = new GeometricCuboid(width, height, length);
        // creating an instance

        System.out.println(cuboid.toString());
    }
}

class GeometricCuboid {
    private final int width;
    private final int height;
    private final int length;

    public GeometricCuboid(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Cuboid(" +
                "w=" + width +
                ", h=" + height +
                ", l=" + length + ')';
    }
}