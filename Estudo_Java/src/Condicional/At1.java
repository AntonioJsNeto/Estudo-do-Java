package Condicional;

import java.util.Scanner;

public class At1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int x = sc.nextInt();

        if (x < 0){
            System.out.println("NEGATIVO");
        }else {
            System.out.println("NÃO NEGATIVO");
        }
    }
}
