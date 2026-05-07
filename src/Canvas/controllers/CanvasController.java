package Canvas.controllers;

import Canvas.CanvasBuffer;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class CanvasController implements Initializable {


    private ImageView canvas_view;
    private CanvasBuffer myBuffer;

    private boolean canvasExists;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        canvasExists = false;
        myBuffer = null;
    }

    public void createCanvas(final int theHeight, final int theWidth) {
        canvasExists = true;
        myBuffer = new CanvasBuffer(theHeight, theWidth);
    }
}
