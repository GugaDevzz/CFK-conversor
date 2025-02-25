package temp.medida;

import java.util.Scanner;

public class CelsiusClasse {

    public double CelciusClassFah() {
        Scanner scanner = new Scanner(System.in);
        double resultadoC = 0.0;

        while (true) {
            System.out.println("Quantos graus Celsius você quer converter?");
            String grausce = scanner.nextLine();

            // Verifica se a entrada é um número
            try {
                Integer.parseInt(grausce); // Tenta converter para inteiro
                int intCelsius = Integer.parseInt(grausce);  // Agora que é um número válido, convertemos para int

                System.out.println("Converter " + grausce + "°C para qual medida: Fahrenheit ou kelvin?");
                String fahorkel = scanner.nextLine();

                if (fahorkel.equalsIgnoreCase("Fahrenheit")) {
                    resultadoC = (intCelsius * 1.8) + 32;
                    System.out.println(grausce + " °C é igual a: " + resultadoC + " Fahrenheit");
                    break;  // Sai do loop, pois a conversão foi realizada
                } else if (fahorkel.equalsIgnoreCase("Kelvin")) {
                    resultadoC = intCelsius + 273.15;
                    System.out.println(grausce + " °C é igual a: " + resultadoC + " Kelvin");
                    break;  // Sai do loop, pois a conversão foi realizada
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }

        return resultadoC;
    }
}
