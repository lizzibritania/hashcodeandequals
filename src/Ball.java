/**
 * Created by Lizzi on 18.10.2016.
 */
public class Ball {

    private float x;
    private float y;
    private int radius;
   private float xDelta;
   private float yDelta;

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Ball)) return false;

        Ball ball = (Ball) o;

        if ((x==ball.x)&&(y==ball.y)&&(radius==ball.radius))
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = (x != +0.0f ? Float.floatToIntBits(x) : 0);
        result = 31 * result + (y != +0.0f ? Float.floatToIntBits(y) : 0);
        result = 31 * result + radius;

        return result;
    }

    public Ball(float x, float y, int radius, int speed, int direction) {
        float sino=(float)Math.cos(Math.PI*direction/180);
        float coso=(float)Math.sin(Math.PI*direction/180);
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float)speed*sino;
        this.yDelta =(float)speed*coso;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move(){
        x+=xDelta;
        y+=yDelta;

    }
    public void reflectHorizontal()
    {xDelta=-xDelta;}

    @Override
    public String toString() {
        return "Ball{" +
                "(" + x +
                ", " + y +
                ") , speed= (" + xDelta +
                ", " + yDelta +
                ")}";
    }

    public void reflectVertical()
    {yDelta=-yDelta;}
}
