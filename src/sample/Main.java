package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.logging.Logger;

public class Main extends Application {
    //final static Logger LOGGER = Logger.getLogger("MAIN");
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("BC");
        primaryStage.setScene(new Scene(root, 235, 393));
        primaryStage.getIcons().add(new Image("file:res/myIcon2_2.png"));
        //LOGGER.info("icon is installed");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
