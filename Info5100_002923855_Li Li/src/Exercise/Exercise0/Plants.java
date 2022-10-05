package Exercise.Exercise0;

public class Plants {

    public String name;
    public boolean flowers;
    public String color;
    public boolean indoors;
    public boolean outdoors;
    public int num;
    public int size;
    public int price;

    public Plants() {
        System.out.println("p1 has been created");
    }

    public Plants(int price) {
        this.price = price;
        System.out.println("p2 has been created");
    }

    public Plants(String name) {
        this.name = name;
        System.out.println("p3 has been created");
    }

    public class InnerPlants {

    }

    public class InnerPlants2 {

    }

    public void printPlantsName() {

    }

    public void printPlantsPrice() {

    }

    public void printPlantsNum() {
    }
}
