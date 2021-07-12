package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Creating a Text object
        Text text = new Text();
        Text text2 = new Text();

        //Setting the text to be added.
        text.setText("Hello how are you");
        text2.setText("Apa khabar?");

        //setting the position of the text
        text.setX(50);
        text.setY(50);


        text2.setX(100);
        text2.setY(100);

        //Creating a Group object
        Group root = new Group(text,text2);


        //Creating a scene object
        Scene scene = new Scene(root, 1200, 300);

        //Setting title to the Stage
        Stage stage = new Stage();
        
        stage.setTitle("Sample Application");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
