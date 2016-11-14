package Factoryinterface;

/**
 * Created by Lizzi on 15.11.2016.
 */
public class SedanCar implements Car {

    public SedanCar() {
        super();
    }

    @Override
    public void build() {
        System.out.println("I am sedan car");
    }

    @Override
    public CarType getCarModel() {
        return null;
    }

    @Override
    public void setCarModel(CarType carModel) {

    }
}
