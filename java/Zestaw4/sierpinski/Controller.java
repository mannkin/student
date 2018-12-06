package sample;

import javafx.event.ActionEvent;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.effect.BlendMode;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.TextAlignment;

public class Controller {

    public Label label;
    public Canvas canvas;
    private GraphicsContext gc;
    private double x1, y1, x2, y2;
    Line l1,l2,l3;
    Point2D p1,p2,p3;

    public void initialize() {
        gc = canvas.getGraphicsContext2D();
        clear(gc);
        label.setWrapText(true);
        label.setTextAlignment(TextAlignment.LEFT);
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
        label.setText(coordsToString());
    }

    public void clearCanvas(ActionEvent actionEvent) {
        clear(gc);
    }

    public void drawRect(ActionEvent actionEvent) {
        double x = x1;
        double y = y1;
        double w = x2 - x1;
        double h = y2 - y1;

        if (w < 0) {
            x = x2;
            w = -w;
        }

        if (h < 0) {
            y = y2;
            h = -h;
        }

        gc.strokeRect(x + 0.5, y + 0.5, w, h);
    }

    public void sayHello(ActionEvent actionEvent) {
        label.setText("Hello");
    }

    public String coordsToString() {
        String str = "x1: "+Double.toString(x1)+" "+"y1: "+Double.toString(y1)+" "+"x2: "+Double.toString(x2)+" "+"y2: "+Double.toString(y1);
        return str;
    }

    public void draw(ActionEvent actionEvent) {

        p1=new Point2D((x2+x1)/2,y1);
        p2=new Point2D(x1,y2);
        p3=new Point2D(x2,y2);
        run(5,p1,p2,p3);
    }

    public void run(int order,Point2D p1,Point2D p2,Point2D p3){

        if(order==0){

            gc.strokeLine(p1.getX(),p1.getY(),p2.getX(),p2.getY());
            gc.strokeLine(p1.getX(),p1.getY(),p3.getX(),p3.getY());
            gc.strokeLine(p2.getX(),p2.getY(),p3.getX(),p3.getY());

        }else{

            Point2D p12=midpoint(p1,p2);
            Point2D p23=midpoint(p2,p3);
            Point2D p31=midpoint(p3,p1);

            gc.strokeLine(p1.getX(),p1.getY(),p2.getX(),p2.getY());
            gc.strokeLine(p1.getX(),p1.getY(),p3.getX(),p3.getY());
            gc.strokeLine(p2.getX(),p2.getY(),p3.getX(),p3.getY());

            run(order-1,p1,p12,p31);
            run(order-1,p12,p2,p23);
            run(order-1,p31,p23,p3);
        }
    }

    public Point2D midpoint(Point2D pp1, Point2D pp2) {
        return new Point2D((pp1.getX() + pp2.getX()) / 2, (pp1.getY() + pp2.getY()) / 2);
    }
}
