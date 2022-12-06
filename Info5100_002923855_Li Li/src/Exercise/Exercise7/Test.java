package Exercise.Exercise7;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Test tq = new Test();
        tq.testSpecificElement();
        Integer[] a = { 11, 22, 33, 44, 55 };
        System.out.println("Initial value:"  + a[0] + " , " + a[3]);
        swap(a, 0, 3);
        System.out.println("After swap value:" + a[0] + " , " + a[3]);

        tq.testMax();
    }

    public void testSpecificElement() {
        List<Integer> list = Arrays.asList(1, 4, 5, 7, 8, 9, 13, 11);
        PrimeNumber pn = new PrimeNumber();
        EvenNumber en = new EvenNumber();
        Algorithm a = new Algorithm();
        System.out.println("Count of prime numbers:" + a.count(list, pn));
        System.out.println("Count of even numbers:"  + a.count(list, en));

    }

    private static <T> void swap(T[] a, int i, int j)  {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void testMax(){
        List<Integer> c = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Algorithm b = new Algorithm();
        System.out.println(b.maximalElement(c, 3, 8));
    }
}

