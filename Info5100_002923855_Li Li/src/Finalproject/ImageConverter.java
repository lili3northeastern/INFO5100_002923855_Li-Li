package Finalproject;

import javax.swing.*;
import java.awt.*;

public class ImageConverter extends JFrame {
    private JLabel imageLabel;
    private JCheckBox jpgCheckBox;
    private JCheckBox pngCheckBox;
    private JCheckBox gifCheckBox;
    private JButton convertButton;
    private JButton downloadButton;

    public ImageConverter() {
        super("Image Converter");
        setLayout(new FlowLayout());
        // create and add image preview
        imageLabel = new JLabel(new ImageIcon("image.jpg"));
        add(imageLabel);

// create and add checkboxes for selecting conversion formats
        jpgCheckBox = new JCheckBox("JPG");
        pngCheckBox = new JCheckBox("PNG");
        gifCheckBox = new JCheckBox("GIF");
        add(jpgCheckBox);
        add(pngCheckBox);
        add(gifCheckBox);

// create and add convert and download buttons
        convertButton = new JButton("Convert");
        downloadButton = new JButton("Download");
        add(convertButton);
        add(downloadButton);

// add action listeners for buttons
        convertButton.addActionListener(event -> convertImage());
        downloadButton.addActionListener(event -> downloadImages());

    }

    private void convertImage() {
// check selected formats and convert image accordingly
        if (jpgCheckBox.isSelected()) {
// convert to JPG
        }
        if (pngCheckBox.isSelected()) {
// convert to PNG
        }
        if (gifCheckBox.isSelected()) {
// convert to GIF
        }
    }

    private void downloadImages() {
// check selected formats and download converted images
        if (jpgCheckBox.isSelected()) {
// download JPG image
        }
        if (pngCheckBox.isSelected()) {
// download PNG image
        }
        if (gifCheckBox.isSelected()) {
// download GIF image
        }
    }
}




