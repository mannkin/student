package sample;

public class Player implements Runnable {

    private int width = 40;
    private int height = 100;
    private int x, y;

    @Override
    public void run() {

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
