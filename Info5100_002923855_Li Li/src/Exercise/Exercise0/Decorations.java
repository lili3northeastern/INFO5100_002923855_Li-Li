package Exercise.Exercise0;

public class Decorations {

    public String name;
    public boolean isFragile;
    public boolean forChristmas;
    public double weight;
    public String color;
    public String brand;
    public int num;
    public int size;

    public Decorations() {
        System.out.println("d1 has been created");
    }

    public Decorations(String name) {
        this.name = name;
        System.out.println("d2 has been created");
    }

    public Decorations(String name, int num) {
        this.name = name;
        this.num = num;
        System.out.println("d3 has been created");
    }

    public class InnerDecorations{

    }

    public class InnerDecorations2{

    }

    public void printDecorationsName(){

    }

    public void printDecorationsColor(){

    }

    public void printDecorationsNum(){

    }
}
