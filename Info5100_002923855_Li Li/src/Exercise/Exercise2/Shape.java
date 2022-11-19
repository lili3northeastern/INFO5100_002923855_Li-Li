package Exercise.Exercise2;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract methods
    public abstract void draw();

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
