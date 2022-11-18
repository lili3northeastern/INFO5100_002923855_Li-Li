package Exercise.Exercise2;

// A Square Class, Which Inherits from the Shape Class

class Square extends Shape {
    private double side;
    public static String color;


    public Square(double side, String color) {
        // Set the shape name as "Square"
        super("Square");
        this.side = side;
        this.color = color;

    }

    // Provide an implementation for inherited abstract draw() method
    public void draw() {
        System.out.println("Drawing a square...");
    }

    // Provide an implementation for inherited abstract calculateArea() method
    @Override
    public double calculateArea() {
        return side * side;
    }

    // Provide an implementation for inherited abstract calculatePerimeter() method
    @Override
    public double calculatePerimeter() {
        return 4.0 * side;
    }

}


