package Exercise.Exercise0;

public class Clothes {

    public String model;
    public boolean hasHat;
    public boolean hasSleeve;
    public String color;
    public String brand;
    public int num;
    public int size;
    public int button;

    public Clothes() {
        System.out.println("cl1 has been created");
    }
    public Clothes(String color){
        this.color = color;
        System.out.println("cl2 has been created");
    }
    public Clothes(String color,int size){
        this.color = color;
        this.size = size;
        System.out.println("cl3 has been created");
    }

    public class InnerClothes{

    }

    public class InnerClothes2{

    }

    public void printClothesModel(){

    }

    public void printClothesColor(){

    }
    public void printClothesButton(){

    }
}
