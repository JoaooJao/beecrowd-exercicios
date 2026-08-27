package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee1858 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int algoz = sc.nextInt();
        int min = 0;

        for (int i = 0; i < algoz; i++) {
            int value = sc.nextInt();
            list.add(value);
        }
        int atual = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < atual) {
                atual = list.get(i);
                min = i;
            }
        }
        System.out.println(min + 1);
    }
}
