package lesson1;

import java.lang.Math.*;
import java.util.*;

public class Triangle {
    private double a, b, c;

    public Triangle() {
        this.a = this.b = this.c = 1;
    }

    public Triangle(int value) {
        this.a = this.b = this.c = value;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Неравенство соблюдено.");
        } else {
            System.out.println("Неравенство нарушено.");
        }
    }

    public double getPerim() {
        return a + b + c;
    }

    public double getSquare() {
        double semiPerimeter = getPerim() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    public static void compareTriangle(Triangle first, Triangle second, Triangle third) {

    }

}

class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle triangle2 = new Triangle(10);
        Triangle triangle3 = new Triangle(5, 8, 100);

        Triangle.compareTriangle(triangle, triangle2, triangle3);
    }
}
