import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Sample content to demonstrate Overlay functionality.
 * @author Ananay Gupta
 * @version 1.0.0
 */
public class ContentTest extends ImageView {
    /**
     * Basic constructor that generates an imageview with the sample gif
     */
    public ContentTest() {
        // create an ImageView with the given sample image
        // note the file path starts with file: since the Image constructor requires a URL and not a path
        super(new Image("file:res/images/test.gif"));
        // set the width and the height of the ImageView to that of the real width and height of the sample image
        this.setFitHeight(348);
        this.setFitWidth(490);
    }
}
