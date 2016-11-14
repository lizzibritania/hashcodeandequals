/**
 * Created by Lizzi on 04.11.2016.
 */

public class MovablePoint implements Movable {
    public MovablePoint() {
    }

    protected int x,y,xSpeed,ySpeed;

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y-=ySpeed;

    }

    @Override
    public void moveDown() {

        y+=ySpeed;
    }

    @Override
    public void moveRight() {
x+=xSpeed;
    }

    @Override
    public void moveLeft() {
x-=xSpeed;
    }
}
