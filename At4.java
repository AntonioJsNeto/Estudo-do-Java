package Condicional;

import java.util.Scanner;

public class At4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        int d = 24;

        System.out.println("Informe as horas: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            c = (d - a) + b;
            System.out.println("O JOGO DUROU: " + c + " HORA(S)");
        }else{
            c = b - a;
            System.out.println("O JOGO DUROU: " + c + " HORA(S)");
        }

    }
}