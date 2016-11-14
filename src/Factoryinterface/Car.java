package Factoryinterface;

/**
 * Created by Lizzi on 15.11.2016.
 */
public abstract interface Car {
    CarType carModel = null;
    void build();

    public CarType getCarModel();

    public void setCarModel(CarType carModel);
}
