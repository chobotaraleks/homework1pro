package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вага в кг:");
        double kilograms = scanner.nextDouble();
        double pounds = kilogramsToPounds(kilograms);
        System.out.println(kilograms + " кг = " + pounds + " фунтов.");

        System.out.println("Вага в фунтах:");
        double lbs = scanner.nextDouble();
        double kg = poundsToKilograms(lbs);
        System.out.println(lbs + " фунтов = " + kg + " кг.");
    }

    public static double kilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double poundsToKilograms(double lbs) {
        return lbs / 2.20462;
    }
}
