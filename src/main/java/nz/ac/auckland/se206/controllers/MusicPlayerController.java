// package nz.ac.auckland.se206.controllers;

// import java.io.IOException;

// import javafx.fxml.FXML;
// import javafx.scene.Scene;
// import javafx.event.ActionEvent;
// import javafx.scene.control.Button;
// import javafx.scene.media.Media;
// import javafx.scene.media.MediaPlayer;
// import nz.ac.auckland.se206.App;
// import nz.ac.auckland.se206.SceneManager;
// import nz.ac.auckland.se206.SceneManager.AppUi;

// public class MusicPlayerController {

//   @FXML
//   private void intialize() {
//     System.out.println("******************* Intializing MusicPlayerController *******************" + this);
//   }

//   @FXML
//   private void song1() {
//     System.out.println("song1 clicked");
//     Media sound = new Media(App.class.getResource("/sounds/song1.mp3").toExternalForm());
//     MediaPlayer player = new MediaPlayer(sound);
//     player.play();
//   }

//   @FXML
//   private void song2() {
//     System.out.println("song2 clicked");
//     Media sound = new Media(App.class.getResource("/sounds/song2.mp3").toExternalForm());
//     MediaPlayer player = new MediaPlayer(sound);
//     player.play();
//   }

//   @FXML
//   private void song3() {
//     System.out.println("song3 clicked");
//     Media sound = new Media(App.class.getResource("/sounds/song3.mp3").toExternalForm());
//     MediaPlayer player = new MediaPlayer(sound);
//     player.play();
//   }

//   @FXML
//   private void switchToCounter(ActionEvent event) {
//     // System.out.println("switch to counter clicked");
//     Button button = (Button) event.getSource();
//     Scene sceneButtonIsIn = button.getScene();
//     sceneButtonIsIn.setRoot(SceneManager.getUiRoot(AppUi.COUNTER));

//     // try {
//     // sceneButtonIsIn.setRoot(App.loadFXML("counter"));
//     // } catch (IOException e) {
//     // e.printStackTrace();
//     // }
//   }

// }

package nz.ac.auckland.se206.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import nz.ac.auckland.se206.App;
import nz.ac.auckland.se206.SceneManager;
import nz.ac.auckland.se206.SceneManager.AppUi;

public class MusicPlayerController {

  private MediaPlayer currentPlayer;

  @FXML
  private void initialize() {
    System.out.println("******************* Intializing MusicPlayerController *******************" + this);
  }

  @FXML
  private void song1() {
    playSong("/sounds/song1.mp3");
  }

  @FXML
  private void song2() {
    playSong("/sounds/song2.mp3");
  }

  @FXML
  private void song3() {
    playSong("/sounds/song3.mp3");
  }

  private void playSong(String resourcePath) {
    stopCurrentSong();
    Media sound = new Media(App.class.getResource(resourcePath).toExternalForm());
    currentPlayer = new MediaPlayer(sound);
    currentPlayer.play();
  }

  private void stopCurrentSong() {
    if (currentPlayer != null) {
      currentPlayer.stop();
    }
  }

  @FXML
  private void switchToCounter(ActionEvent event) {
    stopCurrentSong();
    Button button = (Button) event.getSource();
    Scene sceneButtonIsIn = button.getScene();
    sceneButtonIsIn.setRoot(SceneManager.getUiRoot(AppUi.COUNTER));
  }
}