package CarFactory;

public class Palio extends HatchCar {
    @Override
    public String getType() {
        return "Fiat Palio";
    }

    @Override
    public void showInfo() {
        System.out.println("Sou um " + getType() + " com design compacto e bom desempenho.");
    }
}
