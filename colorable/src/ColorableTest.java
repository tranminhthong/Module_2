public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Square(5);
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                System.out.print("Square: ");
                ((Colorable) shape).howToColor();
            } else
                System.out.println(shape);
        }
    }
}
