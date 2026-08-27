package Iniciante;

import java.util.Scanner;

public class Bee1589 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int v1, v2;
        for (int i = 0; i < loop; i++) {
            v1 = sc.nextInt();
            v2 = sc.nextInt();
            System.out.println(v1 + v2);
        }
    }
}
