abstract class Shape {

    // Abstract method
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a shape.");
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculate_area() {
        return length * width;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.calculate_area());
        System.out.println("Rectangle Area: " + rectangle.calculate_area());


        circle.display_info();
        rectangle.display_info();
    }
}
