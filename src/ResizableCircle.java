/**
 * Created by Lizzi on 15.11.2016.
 */
public class ResizableCircle extends Circle implements Resizable
{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius*=percent/100;
    }
}
