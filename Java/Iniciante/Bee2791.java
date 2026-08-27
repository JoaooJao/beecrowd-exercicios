package Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee2791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        int v1 = sc.nextInt();
        lista.add(v1);
        int v2 = sc.nextInt();
        lista.add(v2);
        int v3 = sc.nextInt();
        lista.add(v3);
        int v4 = sc.nextInt();
        lista.add(v4);

        for(int i = 0 ; i < lista.size(); i++){
            if(lista.get(i).equals(1)){
                System.out.println(i + 1);
                break;
            }
        }
    }
}
