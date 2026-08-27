package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listLesma = new ArrayList<>();

        while (sc.hasNext()) {
            int number = sc.nextInt();
            int maior = 0;
            for (int i = 0; i < number; i++) {
                int vel = sc.nextInt();
                listLesma.add(vel);
            }
            for (int i = 0; i < listLesma.size(); i++) {
                if (listLesma.get(i) > maior) {
                    maior = listLesma.get(i);
                }
            }
            if (maior < 10) {
                System.out.println(1);
            } else if (maior > 10 && maior < 20) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
            listLesma.clear();
        }
        sc.close();
    }
}
