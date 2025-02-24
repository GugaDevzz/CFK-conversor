package temp.medida;

import java.util.Scanner;

public class Kelvin {

    public double KelvinClass () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos graus Kelvin você quer converter?");
        String grauske = scanner.nextLine();

        System.out.println("Converter " + grauske + "°K para qual medida: Celsius ou Fahrenheit?");
        String CelorFah = scanner.nextLine();

        double resultadoK = 0.0;
        int intCelsius = Integer.parseInt(grauske);


        if (CelorFah.equalsIgnoreCase("Celsius")) {  // Use equalsIgnoreCase para evitar erro com letras maiúsculas/minúsculas
            resultadoK = intCelsius - 273.15;
            System.out.println(grauske + " °F é igual a " + resultadoK + " Celsius");
        } else if (CelorFah.equalsIgnoreCase("Fahrenheit")) {
            resultadoK = ((((intCelsius - 273.15) * 9) / 5) + 32);
            System.out.println(grauske + " °C é igual a: " + resultadoK + " Kelvin");
        }

        return resultadoK;
    }

}
