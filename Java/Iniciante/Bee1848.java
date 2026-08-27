package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee1848 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int algoz = sc.nextInt();
        int indice = 0;
        int atual = 100;
        for (int i = 0; i < algoz; i++) {
            int value = sc.nextInt();
            if(value < atual){
                atual = value;
                indice = i;
            }
        }
        System.out.println(indice + 1);
    }
}
