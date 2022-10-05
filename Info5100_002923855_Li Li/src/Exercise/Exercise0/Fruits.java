package Exercise.Exercise0;

public class Fruits {

    public String name;
    public String shape;
    public String color;
    public String supermarket;
    public int num;
    public int size;
    public double weight;
    public boolean hasPeel;

    public Fruits() {
        System.out.println("fr1 has been created");
    }

    public Fruits(String name) {
        this.name = name;
        System.out.println("fr2 has been created");
    }

    public Fruits(String name, int num) {
        this.name = name;
        this.num = num;
        System.out.println("fr3 has been created");
    }

    public class InnerFruits{

    }

    public class InnerFruits2{

    }

    public void printFruitsColor(){

    }

    public void printFruitsName(){

    }
    public void printFruitsShape(){

    }
}
