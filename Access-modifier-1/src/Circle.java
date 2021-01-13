public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        radius = r;
    }

    public String getColor() {
        return this.color;
    }

    double getRadius() {
        return this.radius;
    }

    double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
