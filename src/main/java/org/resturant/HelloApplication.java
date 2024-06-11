package org.resturant;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("view/login-menu.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("view/main-menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Welcome!");
        stage.setResizable(false);
        stage.setFullScreen(true);
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);


        stage.setScene(scene);
//        stage.setAlwaysOnTop(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}