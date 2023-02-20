import java.util.Scanner;

public class MainConsole {
    
    public MainConsole() {
        double[] input = input();
        Telteg calc = new Telteg();
        calc.calcArea(input);
    }

    public double[] input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg az A oldalt: ");
        double sideA = scanner.nextDouble();
        System.out.println("Adja meg a B oldalt: ");
        double sideB = scanner.nextDouble();
        double[] input = {sideA,sideB};
        return input;
    }
}
