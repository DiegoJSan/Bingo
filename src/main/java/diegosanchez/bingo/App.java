package diegosanchez.bingo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class App extends Application {

    @Override
    public void start(Stage stage) {
        Pane paneRoot = new Pane();
        var scene = new Scene(paneRoot, 640, 480);
        stage.setScene(scene);
        stage.show();
        
        Carton carton = new Carton(5);
        System.out.println(carton.getNumPos(4, 2));
        carton.getNumPos(4, 2);
    }

    public static void main(String[] args) {
        launch();
    }

}