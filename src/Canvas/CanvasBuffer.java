package Canvas;

import javafx.scene.image.PixelBuffer;
import javafx.scene.image.PixelFormat;

import java.nio.Buffer;
import java.nio.IntBuffer;

public class CanvasBuffer extends PixelBuffer<IntBuffer> {

    public CanvasBuffer(final int theHeight, int theWidth) {
        super(theHeight, theWidth, IntBuffer.allocate(theHeight * theWidth), PixelFormat.getIntArgbInstance());
    }
}
