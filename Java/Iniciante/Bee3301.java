package Iniciante;
import java.util.Scanner;

public class Bee3301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int z = sc.nextInt();
        int l = sc.nextInt();

        if ((z > h && z < l) || (z < h && z > l)) {
            System.out.println("zezinho");
        } else if ((l > h && l < z) || (l < h && l > z)) {
            System.out.println("luisinho");
        } else {
            System.out.println("huguinho");
        }

        sc.close();
    }
}