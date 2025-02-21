import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    String Celsius = "Celsius";
    String Fahrenheit;
    String Kelvin ;
    String inicial = "Qual medida deseja converter?";


    System.out.println(inicial);
    System.out.println("Celsius, Fahrenheit, Kelvin");
    String primeiramedida = scanner.nextLine();

    if (primeiramedida.equals(Celsius)){
        System.out.println("Quantos graus Celsius quer converter");
        String grausce = scanner.nextLine();


        System.out.println("Deseja converter " + grausce + " Celsius para qual medida: Fahrenheit ou kelvin");
        String fahorkel = scanner.nextLine();

        if (fahorkel.equals("Fahrenheit")){
            int intfah = Integer.parseInt(grausce);
            double operadorfah = (intfah * 1.8) + 32;
            System.out.println(grausce + " °C em Fahrenheit é " + operadorfah);
        }
    }



    }
}