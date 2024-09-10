package src.Repeticao;

import java.util.Scanner;

public class At8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME A QUANTIDADE DE LOOP");
        int n = sc.nextInt();
        int fat = 1;

        for (int i = 1; i <= n; i++){
            fat = fat * i;
        }
        System.out.println(fat);
    }
}

