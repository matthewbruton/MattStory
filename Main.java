
package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
  @Override
  public void start(Stage primaryStage) {
    try {

      BorderPane root = new BorderPane();
      // myLabel
      Label myLabel = new Label("CS400 MyFirstJavaFX");
      // myComboBox
      ObservableList<String> colors =
          FXCollections.observableArrayList("Red", "Orange", "Yellow", "Green", "Blue", "Purple");
      ComboBox<String> myComboBox = new ComboBox<String>(colors);
      myComboBox.setPromptText("What is your favorite color?");
      // myImageView
      Image myFace = new Image("myFace.jpg");
      ImageView myImageView = new ImageView();
      myImageView.setImage(myFace);
      // myButton
      Button myButton = new Button("Done");
      // myTextField
      TextField myTextField = new TextField("Type here!");

      // add to BorderPane
      root.setTop(myLabel);
      root.setLeft(myComboBox);
      root.setCenter(myImageView);
      root.setBottom(myButton);
      root.setRight(myTextField);

      Scene scene = new Scene(root, 1600, 900);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

      primaryStage.setTitle("Matt's First JavaFX program");
      primaryStage.setScene(scene);
      primaryStage.show();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
