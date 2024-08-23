package Condicional;

import java.util.Scanner;

public class At2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("informe um número");
        a = sc.nextInt();

        if (a %2 == 0){
            System.out.println("PAR");
        }else if (a % 2 != 0){
            System.out.println("IMPAR");
        }
    }
}