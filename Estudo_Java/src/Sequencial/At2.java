package src.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class At2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double raio = sc.nextDouble();
        double pi = 3.14159;

        double area = pi * Math.pow(raio,2);

        Locale.setDefault(Locale.US);
        System.out.printf("AREA = %.4f %n", area);
    }
}
