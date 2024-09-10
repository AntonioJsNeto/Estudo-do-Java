package src.Repeticao;

import java.util.Scanner;

public class At5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME O VALOR INTEIRO: ");
        int n = sc.nextInt();
        int somaIn = 0, somaOut = 0;

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();

            if (x >= 10 && x <= 20){
                somaIn = somaIn + 1;
            }else {
                somaOut = somaOut + 1;
            }
        }

        System.out.println(somaIn + " IN" + "\n" + somaOut + " out");
    }
}
