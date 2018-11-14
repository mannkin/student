package mandelbrot;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.function.Consumer;


public class Okno extends Application{

    private PixelWriter PW;
    private Scene scena;

    public Okno() {
        WritableImage obraz = new WritableImage(600, 600);
        PW = obraz.getPixelWriter();
        ImageView widok = new ImageView();
        widok.setImage(obraz);
        StackPane root = new StackPane();
        final boolean add = root.getChildren().add(widok);
        scena = new Scene(root, 600, 600);
    }


    private void malujMB() {
        Consumer<Pixel> pixelPainter = (piksel) -> PW.setColor(piksel.getX(), piksel.getY(), piksel.getColor());
        paintMandelbrotSet(600, 600, pixelPainter);
    }

    public void start(Stage primaryStage) {
        paintMandelbrotSet(600, 600, pixelPainter);
        primaryStage.setScene(scena);
        primaryStage.setTitle("Mandelbrot");
        primaryStage.show();
    }
    private void paintMandelbrotSet(int i, int i1, Consumer<Pixel> pixelPainter) {

        Consumer<Pixel> pixelPainter = (pixel) -> PW.setColor(pixel.getX(),pixel.getY(),pixel.getColor());

        MandelbrotSet.paintMandelbrotSet(600, 600, pixelPainter);

    }
    public static void main(String[] args){
        new Okno().launch();
    }


}

