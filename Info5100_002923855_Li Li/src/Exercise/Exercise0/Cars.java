package Exercise.Exercise0;

public class Cars {
// 8 properties
    public String model;
    public String engine;
    public String color;
    public String brand;
    public int num;
    public int size;
    public int window;
    public int seat;


    // Print a statement in constructor to indicate creation of each instance
    public Cars() {
        System.out.println("c1 has been created");
    }

    public Cars(String brand, String color){
        this.brand = brand;
        this.color = color;
        System.out.println("c2 has been created");
    }

    public Cars(String brand, String color,String engine){
        this.brand = brand;
        this.color = color;
        System.out.println("c3 has been created");
    }
    public Cars(String model, String engine, String color, String brand, int num, int size, int window, int seat) {
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.brand = brand;
        this.num = num;
        this.size = size;
        this.window = window;
        this.seat = seat;
    }

    // Include 2 nested classes for one of class
    public class InnerCars{

    }

    public class InnerCars2{

    }

    // 3 methods
    public void printCarsModel(){

    }

    public void printCarsBrand(){

    }

    public void printCarsColor(){

    }
}

