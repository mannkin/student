package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.PixelWriter;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import sample.complex.Complex;

public class Controller {

    public Canvas canvas;
    private GraphicsContext gc;
    private int w = 800;
    private int h = 800;
    private double x1, y1, x2, y2;
    private double minX = -2;
    private double maxX = 2;
    private double minY = -2;
    private double maxY = 2;//minY+(maxX-minX)*h/w;
    private double scaleX = (maxX - minX) / w;
    private double scaleY = (maxY - minY) / h;
    private MandelFractal mandel;
    private PixelWriter pw;

    public void initialize() {
        gc = canvas.getGraphicsContext2D();
        clear(gc);
        pw = gc.getPixelWriter();
        mandel = new MandelFractal();

        mandel.draw(pw, new Complex(minX, maxY), new Complex(maxX, minY), w, h);

    }

    private void clear(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.setGlobalBlendMode(BlendMode.SRC_OVER);
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    public void mouseMoves(MouseEvent mouseEvent) {
    }

    public void mousePressed(MouseEvent mouseEvent) {
        x1 = mouseEvent.getX();
        y1 = mouseEvent.getY();
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        x2 = mouseEvent.getX();
        y2 = mouseEvent.getY();
        minX = minX + x1*scaleX;
        maxX = minX + x2*scaleX;
        minY = maxY - y2*scaleY;
        maxY = maxY - y1*scaleY;
        scaleX = (maxX - minX) / w;
        scaleY = (maxY - minY) / h;
        mandel.draw(pw, new Complex(minX, maxY), new Complex(maxX, minY), w, h);
    }
}
