// ABSTRACTION
abstract class Shape {
    // ENCAPSULATION
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // ABSTRACTION
    public abstract double calculateArea();
}
// INHERITANCE
class Circle extends Shape {
    // ENCAPSULATION
    private double radius;

    public Circle(String color, double radius) {
        // INHERITANCE
        super(color);
        this.radius = radius;
    }

    // POLYMORPHISM
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
// INHERITANCE
class Rectangle extends Shape {
    // ENCAPSULATION
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        // INHERITANCE
        super(color);
        this.length = length;
        this.width = width;
    }

    // POLYMORPHISM
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class practice {
    public static void main(String[] args) {
        // POLYMORPHISM
        Shape circle = new Circle("Red", 5);
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.calculateArea());

        // POLYMORPHISM
        Shape rectangle = new Rectangle("Blue", 4, 6);
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}



