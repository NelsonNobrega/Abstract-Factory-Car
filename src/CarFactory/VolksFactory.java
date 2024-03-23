package CarFactory;

public class VolksFactory implements AbstractCarFactory {
    @Override
    public HatchCar createHatchCar() {
        return new Gol();
    }

    @Override
    public SedanCar createSedanCar() {
        return new Voyage();
    }
}
