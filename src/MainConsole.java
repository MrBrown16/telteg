/*
 * File: MainConsole.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.02.20
 * Github:https://github.com/MrBrown16/telteg
 * Licence: GNU GPL
 */



import java.util.Scanner;

public class MainConsole {
    
    public MainConsole() {
        System.out.println("Móra Barna, Szoft_I_1_N, 2023.02.20.");
        System.out.println("Két egyforma téglalap által alkotott telek területét lehet kiszámolni, amihez egy téglalap két oldalát kell megadni.");
        double[] input = input();
        Telteg calc = new Telteg();
        double area = calc.calcArea(input);
        System.out.println("A telek területe: "+area);
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
