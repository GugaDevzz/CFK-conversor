package temp.medida;

import java.util.Scanner;

public class CelsiusClasse {

    public double CelciusClassFah () {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Quantos graus Celsius você quer converter?");
            String grausce = scanner.nextLine();

            System.out.println("Converter " + grausce + "°C para qual medida: Fahrenheit ou kelvin?");
            String fahorkel = scanner.nextLine();

            double resultadoC = 0.0;
            int intCelsius = Integer.parseInt(grausce);


            if (fahorkel.equalsIgnoreCase("Fahrenheit")) {  // Use equalsIgnoreCase para evitar erro com letras maiúsculas/minúsculas
                resultadoC = (intCelsius * 1.8) + 32;
                System.out.println(grausce + " °C é igual a: " + resultadoC + " Fahrenheit");
            } else if (fahorkel.equalsIgnoreCase("Kelvin")) {
                resultadoC = intCelsius + 273.15;
                System.out.println(grausce + " °C é igual a: " + resultadoC + " Kelvin");
            }

        return resultadoC;
    }
}
