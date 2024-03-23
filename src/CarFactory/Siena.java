package CarFactory;

public class Siena extends SedanCar {
    @Override
    public String getType() {
        return "Fiat Siena";
    }

    @Override
    public void showInfo() {
        System.out.println("Sou um " + getType() + " com design elegante e amplo espaço interno.");
    }
}
