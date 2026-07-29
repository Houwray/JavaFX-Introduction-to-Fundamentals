package nz.ac.auckland.se206.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;
import nz.ac.auckland.se206.App;
import nz.ac.auckland.se206.SceneManager;
import nz.ac.auckland.se206.SceneManager.AppUi;

public class CounterController {

  private int count = 0;

  @FXML
  private Button incrementButton;

  @FXML
  private Button decrementButton;

  @FXML
  private Button resetButton;

  @FXML
  private Button switchButton;

  @FXML
  private Label numberLabel;

  @FXML
  private void increment() {
    count++;
    updateLabel();
    // System.out.println("Increment button clicked. Current count: " + count);
  }

  @FXML
  private void decrement() {
    count--;
    updateLabel();
    // System.out.println("Decrement button clicked. Current count: " + count);
  }

  @FXML
  private void reset() {
    count = 0;
    updateLabel();
  }

  @FXML
  private void updateLabel() {
    numberLabel.setText(Integer.toString(count));
  }

  @FXML
  private void intialize() {
    System.out.println("******************* Intializing CounterController *******************" + this);
  }

  @FXML
  private void switchToMusic(ActionEvent event) {
    // System.out.println("Switching to Music view...");
    // System.out.println(event.getSource().getClass());
    // System.out.println(event.getSource());
    Button button = (Button) event.getSource();
    Scene sceneButtonIsIn = button.getScene();
    sceneButtonIsIn.setRoot(SceneManager.getUiRoot(AppUi.MUSIC_PLAYER));

    // try {
    // sceneButtonIsIn.setRoot(App.loadFXML("musicplayer"));
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
  }
}
