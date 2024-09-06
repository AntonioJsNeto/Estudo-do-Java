package Repeticao.Repeticao;

import java.util.Scanner;

public class At3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME O CODIGO DOS ITENS DE ABASTECIMENTO DO POSTO: ");
        int x = sc.nextInt();

        int alcool = 0, gasolina = 0, diesel = 0;

        while (x != 4) {

            if (x == 1) {
                alcool = alcool + 1;
            } else if (x == 2) {
                gasolina = gasolina + 1;
            } else if (x == 3) {
                diesel = diesel + 1;
            }

            x = sc.nextInt();

            if (x == 4) {
                System.out.println("MUITO OBRIGADO\n");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
            }

        }
    }
}
