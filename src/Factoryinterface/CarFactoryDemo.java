package Factoryinterface;

/**
 * Created by Lizzi on 15.11.2016.
 */
public class CarFactoryDemo {
    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
        carFactory.buildCar(CarType.Hatchback);

    }
}
