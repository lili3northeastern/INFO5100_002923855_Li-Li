package Exercise.Exercise2;

public class ShapeDetails {

        public static void drawShapes(Shape[] list) {
            for (int i = 0; i < list.length; i++) {
                // Draw a shape, no matter what it is
                list[i].draw(); // Late binding
            }
        }

        public static void printShapeDetails(Shape[] list) {
            for (int i = 0; i < list.length; i++) {
                // Gather details about the shape
                String name = list[i].getName(); // Late Binding
                double area = list[i].calculateArea(); // Late binding
                double perimeter = list[i].calculatePerimeter(); // Late binding

                // Print details
                System.out.println("Name: " + name);
                System.out.println("Area: " + area);
                System.out.println("Perimeter: " + perimeter);
            }
        }
    }

