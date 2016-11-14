package Factory;

/**
 * Created by Lizzi on 15.11.2016.
 */
public abstract class Car {
    CarType carModel;
    protected abstract void build();

    public CarType getCarModel() {
        return carModel;
    }

    public void setCarModel(CarType carModel) {
        this.carModel = carModel;
    }
}
