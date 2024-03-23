package CarFactory;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] factories = {"Fiat", "Volkswagen"};
        
        System.out.println("Selecione a fábrica de carros:");
        for (int i = 0; i < factories.length; i++) {
            System.out.println((i + 1) + " - " + factories[i]);
        }

        int option = scanner.nextInt();

        AbstractCarFactory factory;
        switch (option) {
            case 1:
                factory = new FiatFactory();
                break;
            case 2:
                factory = new VolksFactory();
                break;
            default:
                throw new IllegalArgumentException("Opção inválida!");
        }

        HatchCar hatchCar = factory.createHatchCar();
        SedanCar sedanCar = factory.createSedanCar();

        System.out.println();
        hatchCar.showInfo();
        System.out.println();
        sedanCar.showInfo();
    }
}


