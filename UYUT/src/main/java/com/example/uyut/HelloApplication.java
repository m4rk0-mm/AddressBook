package com.example.uyut;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Hello world!");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(600);
        //root.getStylesheets().add(getClass().getResource("my.css").toExternalForm());


        Scene scene = new Scene(root, 600, 600);
        String css = this.getClass().getResource("my.css").toExternalForm();
        scene.getStylesheets().add(css);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Populate the address book with test data and print it
        testData();
    }

    private void testData() {
        CollectionAddressBook addressBook = new CollectionAddressBook();
        addressBook.fillTestData();
        addressBook.print();
    }




    public static void main(String[] args) {
        launch();
    }
}
