package Factoryinterface;

/**
 * Created by Lizzi on 15.11.2016.
 */
public class WagonCar implements Car{
    @Override
    public CarType getCarModel() {
        return null;
    }

    @Override
    public void setCarModel(CarType carModel) {

    }

    @Override
    public void build() {
        System.out.println("I am Wagon car");
    }
}
