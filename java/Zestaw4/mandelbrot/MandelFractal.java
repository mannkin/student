package sample;

import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import sample.complex.Complex;

public class MandelFractal implements ComplexDrawable {

    @Override
    public void draw(PixelWriter pw, Complex a, Complex b, int w, int h) {

        final int l_iteracji = 30;

        double minR = a.re();
        double maxR = b.re();
        double minI = b.im();
        double maxI = a.im();

        double scaleX = (maxR - minR) / w;
        double scaleY = (maxI - minI) / h;
        int scaleRGB = 255/l_iteracji;

        Color[] colors = new Color[l_iteracji];
        for (int i = 0; i<l_iteracji; i++) {
            colors[i] = Color.hsb(i/256f, 1, i/(i+8f));
        }

        for (int x = 0; x < w; x++) {
            for (int y = 0; y < h; y++) {
                Complex c = new Complex(minR + x*scaleX, maxI - y*scaleY);
                Complex z = new Complex(0,0);
                int iteracje = 0;
                while(iteracje < l_iteracji && z.abs() < 2) {
                    z = z.sqr().add(c);
                    iteracje += 1;
                }
                if(iteracje == l_iteracji) {
                    pw.setArgb(x, y,(0xFF<<24) | 0 | 0 | 0);
                }else {
                    //pw.setArgb(x, y, (0xFF << 24) | iteracje*scaleRGB | (iteracje*scaleRGB*2) % 255 | (iteracje*scaleRGB*4) % 255);
                    pw.setColor(x, y, colors[iteracje]);
                }
            }
        }
    }
}

