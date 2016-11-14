/**
 * Created by Lizzi on 15.11.2016.
 */
public class MovableRectangle  implements Movable{
    private MovablePoint topleft, bottomright;

    public MovableRectangle(int x1,int x2,int y1,int y2,int xSpeed, int ySpeed) {
         topleft=new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomright = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        topleft.y-=topleft.ySpeed;
        bottomright.y-=bottomright.ySpeed;
    }

    @Override
    public void moveDown() {
        topleft.y+=topleft.ySpeed;
        bottomright.y+=bottomright.ySpeed;

    }

    @Override
    public void moveRight() {
        topleft.x-=topleft.xSpeed;
        bottomright.x-=bottomright.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topleft=" + topleft +
                ", bottomright=" + bottomright +
                '}';
    }

    @Override
    public void moveLeft() {
        topleft.x+=topleft.xSpeed;
        bottomright.x+=bottomright.xSpeed;
    }
}
