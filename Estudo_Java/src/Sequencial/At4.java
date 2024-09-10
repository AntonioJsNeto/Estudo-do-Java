package src.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class At4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, horasTrabalhadas;
        double salary, valorPorHora;

        number = sc.nextInt();
        valorPorHora = sc.nextDouble();
        horasTrabalhadas = sc.nextInt();

        salary = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + number);
        Locale.setDefault(Locale.US);
        System.out.printf("SALARY =  U$ %.2f %n", salary);
    }
}
