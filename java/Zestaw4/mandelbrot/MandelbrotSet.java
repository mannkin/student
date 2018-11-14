package mandelbrot;

import javafx.scene.paint.Color;

import java.util.function.Consumer;

import static javafx.scene.paint.Color.GREY;
import static mandelbrot.Complex.add;
import static mandelbrot.Complex.sqrAbs;

public class MandelbrotSet {
    final static int l_iteracji = 100;

    public static void paintMandelbrotSet(int width, int height, Consumer<Pixel> colorPixel) {

        double minR = -1.5;
        double maxR = 1.5;
        double minI = -1.5;
        double maxI = minI + (maxR - minR) * height / width;

        double mn_x = (maxR - minR) / (width - 1);
        double mn_y = (maxI - minI) / (height - 1);

        Complex n = new Complex(2,1);
        Complex z = new Complex(1,2);

        for (int x = 0; x < width; x++) {
            n.setRe(minR + x * mn_x);
            for (int y = 0; y < height; y++) {
                n.setIm(maxI - y * mn_y);
                for (int w = 0; x < width; x++) {
                    z.setRe(minR + x * mn_x);
                    for (int b = 0; y < height; y++) {
                        z.setIm(maxI - y * mn_y);
                        int iteracje = 0;
                        z = sqrAbs(z);
                        add(z,n);
                        while (iteracje < l_iteracji && !z.WnajWiekszaNiz(2)) ;
                        colorPixel(colorPixel, x, y, l_iteracji);


                    }
                }

            }
        }
    }



    private static void colorPixel (Consumer < Pixel > colorPixel, int x, int y, int iteracje){
            Pixel piksel = inMandelbrotSet(iteracje) ? new Pixel(x, y, Color.rgb(iteracje % 200, 0, 0)) : new Pixel(x, y, GREY);
            colorPixel.accept(piksel);
        }
        private static boolean inMandelbrotSet(int iteracje){
            return iteracje == l_iteracji;
        }



    }
