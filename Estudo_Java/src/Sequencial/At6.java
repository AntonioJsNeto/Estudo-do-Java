package src.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class At6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double pi = 3.14159;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double triangulo = (a * c) / 2;
        double circulo = pi * Math.pow(c,2);
        double trapezio = ((a + b) * c) / 2 ;
        double quadrado = b * b;
        double retangulo = a * b;

        Locale.setDefault(Locale.US);

        System.out.printf("TRIANGULO: %.3f %n", triangulo);
        System.out.printf("CIRCULO: %.3f %n", circulo);
        System.out.printf("TRAPEZIO: %.3f %n", trapezio);
        System.out.printf("QUADRADO: %.3f %n", quadrado);
        System.out.printf("RETANGULO: %.3f %n", retangulo);

    }
}
