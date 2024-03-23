package CarFactory;

public class FiatFactory implements AbstractCarFactory {
    @Override
    public HatchCar createHatchCar() {
        return new Palio();
    }

    @Override
    public SedanCar createSedanCar() {
        return new Siena();
    }
}

