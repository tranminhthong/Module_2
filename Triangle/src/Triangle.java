import java.util.Scanner;

public class Triangle extends Shape {
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(side1, side2, side3, color);
    }

}

class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh thứ nhất: ");
        triangle.setSide1(sc.nextDouble());
        System.out.print("Nhập độ dài cạnh thứ hai: ");
        triangle.setSide2(sc.nextDouble());
        System.out.print("Nhập độ dài cạnh thứ ba: ");
        triangle.setSide3(sc.nextDouble());
        System.out.print("Nhập màu: ");
        sc.nextLine();
        triangle.setColor(sc.nextLine());

        triangle = new Triangle(triangle.getSide1(), triangle.getSide2(), triangle.getSide3(), triangle.getColor());
        System.out.println(triangle);
    }
}