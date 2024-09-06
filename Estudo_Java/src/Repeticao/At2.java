package Repeticao.Repeticao;

import java.util.Scanner;

public class At2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME AS COORDENADAS DO PLANO CARTESIANO: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0){

            if (x > 0 && y > 0 ){
                System.out.println("PRIMEIRO QUADRANTE! ");
            }else if (x < 0 && y > 0 ){
                System.out.println("SEGUNDO QUADRANTE! ");
            }else if (x < 0 && y < 0 ){
                System.out.println("TERCEIRO QUADRANTE! ");
            }else if (x > 0 && y < 0 ){
                System.out.println("QUARTO QUADRANTE! ");
            }

            x = sc.nextInt();
            y = sc.nextInt();

        }
    }
}
