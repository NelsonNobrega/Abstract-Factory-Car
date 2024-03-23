package CarFactory;



public class Client {
    public static void main(String[] args) {
        AbstractCarFactory factory;

        // Escolha da fábrica
        if (args.length > 0 && args[0].equals("fiat")) {
            factory = new FiatFactory();
        } else {
            factory = new VolksFactory();
        }

        // Criação dos carros
        HatchCar hatchCar = factory.createHatchCar();
        SedanCar sedanCar = factory.createSedanCar();

        // Apresentação dos carros
        hatchCar.showInfo();
        sedanCar.showInfo();
    }
}
