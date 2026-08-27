package Iniciante;

import java.util.Scanner;

public class Bee1933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int card1 = sc.nextInt();
        int card2 = sc.nextInt();

        if (card1 >= card2) {
            System.out.println(card1);
        } else if (card1 <= card2) {
            System.out.println(card2);
        }
    }
}
