package Exercise.Exercise2;

public class Exercise2main {
    /*
    Create a class hierarchy for base class Shape and derived classes Triangle, Rectangle, Circle and Square

    Demonstrate concepts of abstraction, overriding, polymorphism and static field

    May use methods such as 'calculateArea()', 'calculatePerimeter()', etc. as needed for demonstrating concepts

    May use static field to represent color of the class or name of the class to represent concept of static fields
     */

    public static void main(String[] args) {
        Shape[] shapeList = new Shape[4];
        shapeList[0] = new Rectangle(2.0, 4.0, "black"); // Upcasting
        shapeList[1] = new Circle(5.0, "white"); // Upcasting
        shapeList[2] = new Square(2.2, "red");
        shapeList[3] = new Triangle(1.5,3.2, 4.5, 4.0, "yellow");

        // Draw all shapes
        ShapeDetails.drawShapes(shapeList);

        // Print details of all shapes
        ShapeDetails.printShapeDetails(shapeList);
    }

}

