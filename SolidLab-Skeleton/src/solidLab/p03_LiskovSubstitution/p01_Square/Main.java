package solidLab.p03_LiskovSubstitution.p01_Square;

public class Main {
    public static void main(String[] args) {

        Square square = new Square();

        Rectangle rectangle = new Rectangle();

        printArea(square);
        printArea(rectangle);

        System.out.println("Hello World");
    }

    private static void printArea(Shape shape) {
        System.out.println(shape.getArea());
    }
}
