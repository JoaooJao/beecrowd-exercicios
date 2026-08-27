package Iniciante;
import java.util.Scanner;

public class Bee1182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int colunaMatriz = sc.nextInt();
        String operacao = sc.next().toUpperCase();
        double total = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double numero = sc.nextDouble();
                if (j == colunaMatriz) {
                    total += numero;
                }
            }
        }

        if (operacao.equals("S")) {
            System.out.printf("%.1f%n", total);
        } else {
            System.out.printf("%.1f%n", total / 12);
        }
    }
}
