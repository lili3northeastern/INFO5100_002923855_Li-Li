package Exercise.Exercise2;

// A Rectangle Class, Which Inherits from the Shape Class

class Rectangle extends Shape {
    private double width;
    private double height;
    public static String color;

    public Rectangle(double width, double height, String color) {
        // Set the shape name as "Rectangle"
        super("Rectangle");
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Provide an implementation for inherited abstract draw() method
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }

    // Provide an implementation for inherited abstract calculateArea() method
    @Override
    public double calculateArea() {
        return width * height;
    }

    // Provide an implementation for inherited abstract calculatePerimeter() method
    @Override
    public double calculatePerimeter() {
        return 2.0 * (width + height);
    }

}

