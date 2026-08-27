package Iniciante;

import java.util.Scanner;

public class Bee2172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int m;
        do {
            x = sc.nextInt();
            m = sc.nextInt();
            if (x == 0 && m == 0) {
                System.out.print("");
                break;
            } else {
                System.out.println(x * m);

            }


        } while (true);
    }
}
