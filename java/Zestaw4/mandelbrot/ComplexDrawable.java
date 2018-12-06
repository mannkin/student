package sample;

import javafx.scene.image.PixelWriter;
import sample.complex.Complex;

public interface ComplexDrawable {
    void draw(PixelWriter pw, Complex a, Complex b, int w, int h);
}
