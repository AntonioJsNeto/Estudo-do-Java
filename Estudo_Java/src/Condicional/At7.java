package src.Condicional;

import java.util.Scanner;

public class At7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;
        System.out.println("DIGITE O NÚMERO:");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("ORIGEM");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }else if (x < 0 && y > 0)  {
            System.out.println("Q2");
        }else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
    }
}
