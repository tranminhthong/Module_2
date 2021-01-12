import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        double x1 = (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / 2 * this.a;
        return (double) Math.round(x1 * 100) / 100;
    }

    public double getRoot2() {
        double x2 = (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / 2 * this.a;
        return (double) Math.round(x2 * 100) / 100;
    }
}

class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm:\n" + "x1 = " + quadraticEquation.getRoot1() + "\n" + "x2 = " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có một nghiệm duy nhất: \n" + "x1 = x2 = " + quadraticEquation.getRoot2());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}