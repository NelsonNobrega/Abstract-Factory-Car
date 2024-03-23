package CarFactory;

public class Gol extends HatchCar {
    @Override
    public String getType() {
        return "Volkswagen Gol";
    }

    @Override
    public void showInfo() {
        System.out.println("Sou um " + getType() + " com design robusto e alta economia de combustível.");
    }
}

