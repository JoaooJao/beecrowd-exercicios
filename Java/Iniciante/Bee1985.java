package Iniciante;

import java.util.Scanner;

public class Bee1985 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        double total = 0;
        for(int i =0; i < v1; i++){
            int product = sc.nextInt();
            int qtd = sc.nextInt();

            double productValue =(product - 1000) + 0.50;

            total += productValue * qtd;
        }
        System.out.printf("%.2f%n",total);
    }
}
