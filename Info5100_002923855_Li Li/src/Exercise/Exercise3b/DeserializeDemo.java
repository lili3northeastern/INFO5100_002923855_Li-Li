package Exercise.Exercise3b;
import Exercise.Exercise2.Circle;


import java.io.*;
public class DeserializeDemo {

    public static void main(String[] args) {
        Circle c1 = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/shape.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            c1 = (Circle) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Circle class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Circle...");
    }
}
