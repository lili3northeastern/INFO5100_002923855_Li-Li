package Exercise.Exercise2;

class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    public static String color;

    public Triangle(double base, double height, double sideA, double sideB, String color) {
        super("Triangle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle...");

    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + base;
    }
}
