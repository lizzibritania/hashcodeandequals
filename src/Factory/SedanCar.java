package Factory;

/**
 * Created by Lizzi on 15.11.2016.
 */
public class SedanCar extends Car {

    @Override
    protected void build() {
        System.out.println("I am sedan car");
    }
}
