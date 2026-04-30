package Canvas;

import javafx.scene.image.PixelBuffer;
import javafx.scene.image.PixelFormat;

import java.nio.Buffer;
import java.nio.IntBuffer;

public class CanvasBuffer extends PixelBuffer<IntBuffer> {

    public CanvasBuffer(final int theWidth, int theHeight) {
        super(theWidth, theHeight, IntBuffer.allocate(theWidth * theHeight), PixelFormat.getIntArgbInstance());
    }
}
