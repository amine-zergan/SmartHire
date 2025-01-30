package com.example.smarthire;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;


public class SmartHireApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SmartHireApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 560, 400);
        Image image = new Image("C:\\Users\\lenovo\\IdeaProjects\\SmartHire\\src\\main\\java\\com\\example\\smarthire\\logo.png");
        stage.setTitle("SmartHire Application");
        stage.setMaxHeight(400);
        stage.setMaxWidth(560);
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}