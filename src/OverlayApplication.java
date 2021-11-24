import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * A javafx based overlay window.
 * The window will be able to display regular javafx content while being always on top, undecorated and having a transparent background.
 * The window has a StackPane as its root element.
 * @author Ananay Gupta
 * @version 1.0.0
 */
public class OverlayApplication {

    /**
     * Method that will create the overlay window on the given stage and with the given root content at the center of the screen.
     * @param stage The stage that you want to convert to an Overlay
     * @param rootContent The content that you want to add to this Stage
     */
    public static void createOverlay(Stage stage, Node rootContent) {
        createOverlay(stage, rootContent, Pos.CENTER);
    }

    /**
     * Method that will create the overlay window on the given stage and with the given root content at the given Pos relative to a stackpane.
     * @param stage The stage that you want to convert to an Overlay
     * @param rootContent The content that you want to add to this Stage
     * @param rootPositioning The positioning that you want your element to have relative to the StackPane.
     */
    public static void createOverlay(Stage stage, Node rootContent, Pos rootPositioning) {
        // add the content to the overlay
        // overlay is a StackPane that will have everything centered
        StackPane root = new StackPane(rootContent);
        StackPane.setAlignment(rootContent, rootPositioning);

        // allow mouse clicks to pass through stack pane
        root.setPickOnBounds(false);

        // add the StackPane as the root to the main scene
        Scene rootTransparent = new Scene(root);

        createOverlay(stage, rootTransparent);
    }

    /**
     * Method that will create the overlay window on the given stage and with the given root Scene.
     * @param stage The stage that you want to convert to an Overlay
     * @param rootScene The scene that you want to add to the Root
     */
    public static void createOverlay(Stage stage, Scene rootScene) {
        // need this to make sure that the background of the window is transparent
        stage.initStyle(StageStyle.TRANSPARENT);

        //need this to make sure that the overlay is always above other applications
        stage.setAlwaysOnTop(true);

        // paint in a transparent color for the StackPane
        rootScene.setFill(Color.TRANSPARENT);

        // add in the root scene to the overlay and show
        stage.setScene(rootScene);
        stage.show();
    }
}
