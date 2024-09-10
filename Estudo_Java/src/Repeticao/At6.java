package src.Repeticao;

import java.util.Scanner;

public class At6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME O VALOR INTEIRO: ");
        int n = sc.nextInt();
        double soma = 0;

        for (int i = 0; i < n; i++){

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            soma = (( a * 2) + (b * 3) + (c * 5)) / 10;
            System.out.printf("%.1f %n", soma);
        }
    }
}
