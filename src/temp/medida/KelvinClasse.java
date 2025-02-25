package temp.medida;

import java.util.Scanner;

public class KelvinClasse {

    public double KelvinClass () {
        Scanner scanner = new Scanner(System.in);
        double resultadoK = 0.0;

        while (true) {

            System.out.println("Quantos graus Kelvin você quer converter?");
            String grauske = scanner.nextLine();

            try {
                Integer.parseInt(grauske);
                int intCelsius = Integer.parseInt(grauske);

                System.out.println("Converter " + grauske + "°K para qual medida: Celsius ou Fahrenheit?");
                String CelorFah = scanner.nextLine();

                if (CelorFah.equalsIgnoreCase("Celsius")) {  // Use equalsIgnoreCase para evitar erro com letras maiúsculas/minúsculas
                    resultadoK = intCelsius - 273.15;
                    System.out.println(grauske + " °F é igual a " + resultadoK + " Celsius");
                    break;
                } else if (CelorFah.equalsIgnoreCase("Fahrenheit")) {
                    resultadoK = ((((intCelsius - 273.15) * 9) / 5) + 32);
                    System.out.println(grauske + " °C é igual a: " + resultadoK + " Kelvin");
                    break;
                } else {
                    System.out.println("Insira uma opção válida");
                }
            } catch (NumberFormatException e){
                System.out.println("Por favor, insira um número válido.");
            }
        }
        return resultadoK;

    }


}
