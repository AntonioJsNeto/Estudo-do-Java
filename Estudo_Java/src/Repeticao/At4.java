package Repeticao.Repeticao;

import java.util.Scanner;

public class At4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME O VALOR INTEIRO: ");
        int x = sc.nextInt();

        for(int i = 0; i < x; i ++){
            if (i % 2 !=0){
                System.out.println(i);
            }
        }
    }
}
