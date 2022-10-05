package Exercise.Exercise0;

public class House {

    public String city;
    public String state;
    public String street;
    public String address;
    public int room;
    public int size;
    public int window;
    public int bathroom;

    public House() {
        System.out.println("h1 has been created");
    }

    public House(String city) {
        this.city = city;
        System.out.println("h2 has been created");
    }

    public House(int bathroom) {
        this.bathroom = bathroom;
        System.out.println("h3 has been created");
    }

    public class InnerHouse{

    }

    public class InnerHouse2{

    }

    public void printHouseStreet(){

    }

    public void printHouseCity(){

    }
    public void printHouseRoom(){

    }
}
