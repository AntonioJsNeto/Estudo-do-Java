package src.Repeticao;

import java.util.Scanner;

public class At7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME A QUANTIDADE DE LOOP");
        int n = sc.nextInt();
        double x , y, media = 0;

        for (int i = 0; i < n; i++){
            System.out.println("FALE OS NÚMEROS");
            x = sc.nextDouble();
            y = sc.nextDouble();

            if (y == 0){
                System.out.println("DIVISÃO IMPOSSÍVEL!\n");
            }else {
                media = x / y;
                System.out.println(media);
            }
        }
    }
}
