package Finalproject;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WritingPixelsExample extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        //Creating an image
        Image image = new Image(new FileInputStream("https://www.pexels.com/photo/pink-petaled-flower-plant-inside-white-hanging-pot-906150/"));
        int width = (int)image.getWidth();
        int height = (int)image.getHeight();

        //Creating a writable image
        WritableImage wImage = new WritableImage(width, height);

        //Reading color from the loaded image
        PixelReader pixelReader = image.getPixelReader();

        //getting the pixel writer
        PixelWriter writer = wImage.getPixelWriter();

        //Reading the color of the image
        for(int b = 0; b < height; b++) {
            for(int a = 0; a < width; a++) {
                //Retrieving the color of the pixel of the loaded image
                Color color = pixelReader.getColor(a, b);

                //Setting the color to the writable image
                writer.setColor(a, b, color.darker());
            }
        }
        //Setting the view for the writable image
        ImageView imageView = new ImageView(wImage);

        //Creating a Group object
        Group root = new Group(imageView);

        //Creating a scene object
        Scene scene = new Scene(root, 400, 600);

        //Setting title to the Stage
        stage.setTitle("Writing pixels ");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}
