package Canvas;

import javafx.scene.layout.Pane;

public class Canvas extends Pane {

    CanvasBuffer myCanvas;

    public Canvas(final int theWidth ,final int theHeight) {
        super();
        myCanvas = new CanvasBuffer(theWidth, theHeight);
    }
}
