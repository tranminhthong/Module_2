public class Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private String color = "red";

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(double side1, double side2, double side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return (double) Math.round(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)) * 1000) / 1000;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "tam giác màu '" + getColor()
                + "', có diện tích là " + getArea()
                + ", có chu vi là " + getPerimeter();
    }
}
