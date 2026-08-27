package Iniciante;

import java.util.Scanner;

public class Bee2702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rest = 0;

        int chicken = sc.nextInt();
        int beef = sc.nextInt();
        int pasta = sc.nextInt();

        int chose1 = sc.nextInt();
        int chose2 = sc.nextInt();
        int chose3 = sc.nextInt();

        if (chicken < chose1) {
            rest += chicken - chose1;
        }
        if (beef < chose2) {
            rest += beef - chose2;
        }
        if (pasta < chose3) {
            rest += pasta - chose3;
        }
        System.out.println(rest * (-1));
    }
}
