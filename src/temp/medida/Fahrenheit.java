package temp.medida;

import java.util.Scanner;

public class Fahrenheit {

    public double FahrenheitClass() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos graus Fahrenheit você quer converter?");
        String grausfa = scanner.nextLine();

        System.out.println("Converter " + grausfa + "°F para qual medida: Celsius ou kelvin?");
        String Celorkel = scanner.nextLine();

        double resultadoF = 0.0;
        int intCelsius = Integer.parseInt(grausfa);


        if (Celorkel.equalsIgnoreCase("Celsius")) {  // Use equalsIgnoreCase para evitar erro com letras maiúsculas/minúsculas
            resultadoF = (intCelsius - 32) / 1.8;
            System.out.println(grausfa + " °F é igual a " + resultadoF + " Celsius");
        } else if (Celorkel.equalsIgnoreCase("Kelvin")) {
            resultadoF = (((intCelsius - 32) * 5) / 9) + 273.15;
            System.out.println(grausfa + " °C é igual a: " + resultadoF + " Kelvin");
        }

        return resultadoF;
    }

}
