import temp.medida.CelsiusClasse;
import temp.medida.Fahrenheit;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

            CelsiusClasse CelsiusClasse = new CelsiusClasse();
            Fahrenheit Fahrenheit = new Fahrenheit();


            String inicial = "Qual medida deseja converter?";

            System.out.println(inicial);
            System.out.println("Celsius, Fahrenheit, Kelvin");
            String primeiramedida = scanner.nextLine();

            if (primeiramedida.equalsIgnoreCase("Celsius")) {
                double resultadoC = CelsiusClasse.CelciusClassFah();
            } else if (primeiramedida.equalsIgnoreCase("Fahrenheit")){
                double resultadoF = Fahrenheit.FahrenheitClass();

        }
    }
}