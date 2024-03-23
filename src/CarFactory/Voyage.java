package CarFactory;

public class Voyage extends SedanCar {
    @Override
    public String getType() {
        return "Volkswagen Voyage";
    }

    @Override
    public void showInfo() {
        System.out.println("Sou um " + getType() + " com design familiar e excelente custo-benefício.");
    }
}