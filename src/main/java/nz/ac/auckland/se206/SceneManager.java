package nz.ac.auckland.se206;

import java.util.HashMap;
import javafx.scene.Parent;

public class SceneManager {
  public enum AppUi {
    MUSIC_PLAYER, COUNTER
  }

  private static HashMap<AppUi, Parent> sceneMap = new HashMap<>();

  public static void addUi(AppUi ui, Parent uiRoot) {
    sceneMap.put(ui, uiRoot);
  }

  public static Parent getUiRoot(AppUi appUi) {
    return sceneMap.get(appUi);
  }
}
