package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class At5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, qtd;

        System.out.println("DIGITE O CÓDIGO:");
        n = sc.nextInt();

        System.out.println("DIGITE A QUANTIDADE: ");
        qtd = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("VOCÊ SELECIONOU CACHORRO QUENTE:\n " +
                        "VALOR DE R$ 4.00 ");
                double total = 4.00 * qtd;

                Locale.setDefault(Locale.US);
                System.out.printf("TOTAL: R$ %.2f ", total);

                break;
            case 2:
                System.out.println("VOCÊ SELECIONOU X-SALADA:\n " +
                        "VALOR DE R$ 4.50 ");
                double total2 = 4.50 * qtd;

                Locale.setDefault(Locale.US);
                System.out.printf("TOTAL: R$ %.2f ", total2);

                break;

            case 3:
                System.out.println("VOCÊ SELECIONOU X-BACON:\n " +
                        "VALOR DE R$ 5.00 ");
                double total3 = 5.00 * qtd;

                Locale.setDefault(Locale.US);
                System.out.printf("TOTAL: R$ %.2f ", total3);

                break;

            case 4:
                System.out.println("VOCÊ SELECIONOU TORRADA SIMPLES:\n " +
                        "VALOR DE R$ 2.00 ");
                double total4 = 2.00 * qtd;

                Locale.setDefault(Locale.US);
                System.out.printf("TOTAL: R$ %.2f ", total4);

                break;

            case 5:
                System.out.println("VOCÊ SELECIONOU REFRIGERANTE:\n " +
                        "VALOR DE R$ 1.50 ");
                double total5 = 1.50 * qtd;

                Locale.setDefault(Locale.US);
                System.out.printf("TOTAL: R$ %.2f ", total5);

                break;

        }
    }
}