package Iniciante;
import java.io.IOException;

import java.util.Scanner;

public class Bee1564 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int reclamacao = sc.nextInt();

            if (reclamacao == 0) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
        }

        sc.close();
    }
}