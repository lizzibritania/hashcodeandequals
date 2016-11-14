/**
 * Created by Lizzi on 15.11.2016.
 */
import java.lang.Math.*;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements GeometricObject {
    double radius=1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
        return PI*pow(radius,2);

    }
}
