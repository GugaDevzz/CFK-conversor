package temp.medida;

import java.util.Scanner;

public class FahrenheitClasse {

    public double FahrenheitClass() {
        Scanner scanner = new Scanner(System.in);
        double resultadoF = 0.0;

        while (true) {

            System.out.println("Quantos graus Fahrenheit você quer converter?");
            String grausfa = scanner.nextLine();

            try {
                Integer.parseInt(grausfa);
                int intCelsius = Integer.parseInt(grausfa);

                System.out.println("Converter " + grausfa + "°F para qual medida: Celsius ou kelvin?");
                String Celorkel = scanner.nextLine();

                if (Celorkel.equalsIgnoreCase("Celsius")) {  // Use equalsIgnoreCase para evitar erro com letras maiúsculas/minúsculas
                    resultadoF = (intCelsius - 32) / 1.8;
                    System.out.println(grausfa + " °F é igual a " + resultadoF + " Celsius");
                    break;
                } else if (Celorkel.equalsIgnoreCase("Kelvin")) {
                    resultadoF = (((intCelsius - 32) * 5) / 9) + 273.15;
                    System.out.println(grausfa + " °C é igual a: " + resultadoF + " Kelvin");
                    break;
                } else {
                    System.out.println("Insira uma opção válida");
                }
            } catch (NumberFormatException e){
                System.out.println("Por favor, insira um número válido.");
            }
        }
        return resultadoF;
    }

}
