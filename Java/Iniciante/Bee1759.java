package Iniciante;

import java.util.Scanner;

public class Bee1759 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hoho = sc.nextInt();

        for (int i = 0; i < hoho; i++) {
            if (i < hoho -1) {
                System.out.print("Ho ");
            } else {
                System.out.print("Ho!");
            }
        }
    }
}