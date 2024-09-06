package Repeticao.Repeticao;

import java.util.Scanner;

public class At1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("INFORME A SENHA: ");
    int senha = sc.nextInt();

    while(senha != 2002){
        if(senha != 2002){
            System.out.println("SENHA INVÁLIDA!");
        }
        senha = sc.nextInt();
    }
    System.out.println("ACESSO PERMITIDO!");
    }
}
