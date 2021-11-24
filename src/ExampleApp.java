import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Example application to demonstrate overlay capabilities.
 * @author Ananay Gupta
 * @version 1.0.0
 */
public class ExampleApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create a new application with a given node
        OverlayApplication.createOverlay(primaryStage, new ContentTest());
    }
}
