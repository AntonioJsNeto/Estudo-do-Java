package Condicional;

import java.util.Scanner;

public class At3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite um número inteiro: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.println("SÃO MULTIPLOS");
        }else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }
    }
}
