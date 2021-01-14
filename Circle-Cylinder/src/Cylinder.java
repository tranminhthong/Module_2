public class Cylinder extends Circle {
    private double height = 15.5;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, String color, double radius) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * this.getArea();
    }

    @Override
    public String toString() {
        return "A cylinder with color "
                + getColor()
                + ", height = "
                + getHeight()
                + ", Volume = "
                + getVolume();
    }
}

class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(10);
        System.out.println(cylinder);

        cylinder = new Cylinder(5.6, "gray", 5);
        System.out.println(cylinder);
    }
}
