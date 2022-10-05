package Exercise.Exercise0;

public class Meals {

    public String name;
    public boolean lunch;
    public boolean dinner ;
    public boolean breakfast;
    public boolean forKids;
    public int num;
    public int price;
    public int size;

    public Meals() {
        System.out.println("m1 has been created");
    }

    public Meals(int price) {
        this.price = price;
        System.out.println("m2 has been created");
    }

    public Meals(String name) {
        this.name = name;
        System.out.println("m3 has been created");
    }

    public class InnerMeals{

    }
    public class InnerMeals2{

    }

    public void printMealsName(){

    }

    public void printMealsPrice(){

    }
    public void printMealsNum(){

    }
}
