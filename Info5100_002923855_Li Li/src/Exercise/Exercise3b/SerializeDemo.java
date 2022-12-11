package Exercise.Exercise3b;


/*
   Make the classes in exercise # 2 serializable
   Test serialization and deserialization of the objects created in exercise # 2.
    */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializeDemo
{
    public static class Circle implements java.io.Serializable{
        private double radius;
        public static String color;

        public Circle(double radius, String color){
            this.radius = radius;
            this.color = color;
        }
    }
    public static void main(String [] args)
    {
        Circle c1 = new Circle(4.5,"Blue");

        try
        {
            FileOutputStream fileOut = new FileOutputStream("/Users/lili/INFO5100_002923855_Li-Li/Info5100_002923855_Li Li/src/Exercise/Exercise3b/shape.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(c1);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /Users/lili/INFO5100_002923855_Li-Li/Info5100_002923855_Li Li/src/Exercise/Exercise3b/shape.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}









/*
import Exercise.Exercise2.Exercise2main;

import org.junit.Test;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectInputOutputStreamTest {
    // serialization

    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("Object.dat"));
            oos.writeObject(new String("Test serialization"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }

}

 */