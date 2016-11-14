package Factoryinterface;

/**
 * Created by Lizzi on 15.11.2016.
 */
public class HatchBackCar implements Car {

    @Override
   public void build() {
        System.out.println("I am hatchback car");
    }

    @Override
    public CarType getCarModel() {
        return null;
    }

    @Override
    public void setCarModel(CarType carModel) {

    }
}
