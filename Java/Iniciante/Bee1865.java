package Iniciante;

import java.util.Scanner;

public class Bee1865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testes = sc.nextInt();

        for (int i = 0; i < testes; i++) {

            String nome = sc.next().toUpperCase();
            int forca = sc.nextInt();

            if (nome.equals("THOR")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        sc.close();
    }
}
