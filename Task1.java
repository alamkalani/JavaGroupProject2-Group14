package JavaGroupProject2;

import java.sql.SQLOutput;

public class Task1 {
    /*
    Create an Interface 'Shape' with undefined
    methods as calculateArea and
    calculatePerimiter. Create 2 classes Circle &
    Square that implements functionality defined in
    the Shape Interface. Test your code.
     */
    public static void main(String[] args) {
        Circle circle = new Circle(2.2);
        circle.calculateArea();
        circle.calculatePerimiter();

        Square square = new Square(3.3);
        square.calculateArea();
        square.calculatePerimiter();
    }
}

interface Shape {
    void calculateArea();

    void calculatePerimiter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = (radius * radius) * Math.PI;
        System.out.println("The area of this Circle is " + area);
    }

    @Override
    public void calculatePerimiter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of this circle is " + perimeter);
    }
}

class Square implements Shape {
    double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        double area = length * length;
        System.out.println("The area of this square is " + area);
    }

    @Override
    public void calculatePerimiter() {
        double perimeter = length * 4;
        System.out.println("The perimeter of this square is " + perimeter);
    }
}