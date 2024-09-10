package src.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class At5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qtd1, qtd2;
        double preco1, preco2;

        System.out.println("Informe sobre a peça um: ");
        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        preco1 = sc.nextDouble();

        System.out.println();
        System.out.println("Agora a peça dois: ");
        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        preco2 = sc.nextDouble();

        double total = (qtd1 * preco1) + (qtd2 * preco2);
        Locale.setDefault(Locale.US);
        System.out.printf("VALOR A PAGAR: R$ %.2f %n", total);
    }
}
