package AdHoc;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee1129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int loop;

        do {


            loop = sc.nextInt();
            for (int i = 0; i < loop; i++) {
                int v1 = sc.nextInt();
                int v2 = sc.nextInt();
                int v3 = sc.nextInt();
                int v4 = sc.nextInt();
                int v5 = sc.nextInt();
                lista.add(v1);
                lista.add(v2);
                lista.add(v3);
                lista.add(v4);
                lista.add(v5);
                int contador = 0;
                int position = -1;
                for (int x = 0; x < lista.size(); x++) {
                    if (lista.get(x) <= 127) {
                        contador++;
                        position = x;
                    }
                }
                if (contador == 1) {
                    if (position == 0) {
                        System.out.println("A");
                    } else if (position == 1) {
                        System.out.println("B");
                    } else if (position == 2) {
                        System.out.println("C");
                    } else if (position == 3) {
                        System.out.println("D");
                    } else if (position == 4) {
                        System.out.println("E");
                    }
                }else{
                    System.out.println("*");
                }
                lista.clear();
            }

        } while (loop != 0);
    }
}
