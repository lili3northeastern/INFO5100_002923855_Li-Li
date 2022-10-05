package Exercise.Exercise0;

public class Shoes {

    public String model;
    public boolean formal ;
    public String color;
    public String season;
    public String brand;
    public int num;
    public int size;
    public int price;

    public Shoes() {
        System.out.println("s1 has been created");
    }

    public Shoes(int num) {
        this.num = num;
        System.out.println("s2 has been created");
    }

    public Shoes(String season) {
        this.season = season;
        System.out.println("s3 has been created");
    }

    public class InnerShoes{

    }

    public class InnerShoes2{

    }

    public void printShoesPrice() {

    }

    public void printShoesColor() {

    }

    public void printShoesNum() {
    }
}
