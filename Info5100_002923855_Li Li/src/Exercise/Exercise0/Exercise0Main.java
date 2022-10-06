package Exercise.Exercise0;

public class Exercise0Main {

    //Create a Main method to instantiate at least 3 objects of each class
    public static void main(String[] args) {

        Cars c1 = new Cars();
        Cars c2 = new Cars("honda","black");
        Cars c3 = new Cars("honda","white","electronic");
        c1.printCarsModel();
        c2.printCarsColor();
        c3.printCarsColor();

        Clothes cl1 = new Clothes();
        Clothes cl2 = new Clothes("pink");
        Clothes cl3 = new Clothes("pink", 11);

        Decorations d1 = new Decorations();
        Decorations d2 = new Decorations("vase");
        Decorations d3 = new Decorations("vase",3);

        Family f1 = new Family();
        Family f2 = new Family(2);
        Family f3 = new Family(2,2);

        Fruits fr1 = new Fruits();
        Fruits fr2 = new Fruits("orange");
        Fruits fr3 = new Fruits("orange",30);

        House h1 = new House();
        House h2 = new House("San Jose");
        House h3 = new House(4);

        Jobs j1 = new Jobs();
        Jobs j2 = new Jobs(150000);
        Jobs j3 = new Jobs("SDE");

        Meals m1 = new Meals();
        Meals m2 = new Meals(66);
        Meals m3 = new Meals("pizza");

        Plants p1 = new Plants();
        Plants p2 = new Plants(33);
        Plants p3 = new Plants("flower");

        Shoes s1 = new Shoes();
        Shoes s2 = new Shoes(30);
        Shoes s3 = new Shoes("Spring");

    }
}
