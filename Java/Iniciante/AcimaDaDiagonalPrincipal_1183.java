package Iniciante;

import java.util.Scanner;

public class AcimaDaDiagonalPrincipal_1183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diagonalPrincipal = 0;
        int qtd = 0;
        String operacao = sc.next().toUpperCase();
        double total = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double numero = sc.nextDouble();
                if(diagonalPrincipal == 12){
                    break;
                }
                else if(j > diagonalPrincipal) {
                    total += numero;
                    qtd += 1;
                }
            }
            diagonalPrincipal += 1;

        }
        if (operacao.equals("S")) {
            System.out.printf("%.1f%n", total);
        } else {
            System.out.printf("%.1f%n",(total / qtd));
        }

    }
}