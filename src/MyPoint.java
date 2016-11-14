/**
 * Created by Lizzi on 16.10.2016.
 */
import static java.lang.Math.*;


/**
 * Created by Lizzi on 14.10.2016.
 */
public class MyPoint {

    private int x;
    private int y;

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof MyPoint)) return false;

        MyPoint point = (MyPoint) o;

        if ((x == point.x)&&(y==point.y))
            return true;
        else return false;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public MyPoint() {
        this.x=0;
        this.y=0;
    }

    public MyPoint(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {

        return y;
    }
    public int[] getXY() {
        int[] xy = new int[2];
        xy[0]=this.x;
        xy[1]=this.y;
        return xy;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "myPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(){
        return sqrt(pow(x,2)+pow(y,2));}

    public double distance(int x, int y){
        return sqrt(pow((this.x-x),2)+pow((this.y-y),2));}

    public double distance(MyPoint another){
        return sqrt(pow((this.x-another.getX()),2)+pow((this.y-another.getY()),2));
    }
}
