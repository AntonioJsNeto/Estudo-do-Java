package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class At8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        System.out.println("DIGITE O NÚMERO:");
        x = sc.nextDouble();

        Locale.setDefault(Locale.US);

        if(x >0 && x <= 2000.00){
            System.out.println("NÃO PAGA IMPOSTO");
        } else if (x > 2000.00 && x <= 3000.00) {
            double imposto1 = (x - 2000.00) * 0.08;
            System.out.printf("R$ %.2f %n", imposto1);
        }else if (x > 3000.00 && x <= 4500.00) {
            double imposto2 = (x - 3000.00) * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f %n", imposto2);
        }else if (x > 4500.00) {
            double imposto3 = (x - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f %n", imposto3);
        }
    }
}
