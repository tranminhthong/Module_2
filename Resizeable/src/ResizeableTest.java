import java.util.Arrays;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        System.out.println("Diện tích các hình với kích thước mặc định: ");
        System.out.println(Arrays.toString(shapes));
        for (Shape shape : shapes) {
            double a = ((double) Math.round((Math.random() * ((100 - 1) + 1)) * 100) / 100);
            shape.resize(a);
        }
        System.out.println("Diện tích các hình sau khi tăng kích thước ngẫu nhiên: ");
        System.out.println(Arrays.toString(shapes));
    }
}
