package Exercise.Exercise2;

// A Circle Class, Which Inherits from Shape Class
class Circle extends Shape {
    private double radius;
    public static String color;

    public Circle(double radius, String color) {
        super("Circle");
        this.radius = radius;
        this.color = color;

    }

    // Provide an implementation for inherited abstract draw() method
    public void draw() {
        System.out.println("Drawing a circle...");
    }

    // Provide an implementation for inherited abstract calculateArea() method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Provide an implementation for inherited abstract calculatePerimeter() method
    @Override
    public double calculatePerimeter() {
        return 2.0 * Math.PI * radius;
    }

}