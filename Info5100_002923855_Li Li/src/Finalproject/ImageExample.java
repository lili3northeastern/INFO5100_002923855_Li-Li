package Finalproject;

/*
To manage images using JavaFX GUI, follow these steps:
First, create a new JavaFX project in your preferred IDE.
Next, create a new class for your image manager and add a reference to the JavaFX library.
In the class, create a method to load the images from a specified directory and store them in a list.
Create a user interface using JavaFX components such as GridPane, ImageView, and Button to display the images
and allow the user to browse and select them.
Implement the functionality for the user to perform actions on the images such as resizing, rotating, and cropping.
Add a save button to allow the user to save the edited images to a specified directory.
Run the application to test and debug any potential issues.
Once the application is working as desired, package it into a JAR file for distribution.
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImageExample extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        //Creating an image
        Image image = new Image(new FileInputStream("https://www.pexels.com/photo/pink-petaled-flower-plant-inside-white-hanging-pot-906150/"));

        //Setting the image view
        ImageView imageView = new ImageView(image);

        //Setting the position of the image
        imageView.setX(70);
        imageView.setY(55);

        //setting the fit height and width of the image view
        imageView.setFitHeight(365);
        imageView.setFitWidth(400);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);

        //Creating a Group object
        Group root = new Group(imageView);

        //Creating a scene object
        Scene scene = new Scene(root, 700, 600);

        //Setting title to the Stage
        stage.setTitle("Loading an image");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}
