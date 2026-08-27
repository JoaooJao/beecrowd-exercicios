package Strings;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee2137{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            ArrayList<Integer> lista = new ArrayList<>();

            int loop = sc.nextInt();

            for (int i = 0; i < loop; i++) {
                lista.add(sc.nextInt());
            }

            for (int i = 0; i < lista.size() - 1; i++) {
                for (int j = 0; j < lista.size() - 1 - i; j++) {
                    if (lista.get(j) > lista.get(j + 1)) {
                        int aux = lista.get(j);
                        lista.set(j, lista.get(j + 1));
                        lista.set(j + 1, aux);
                    }
                }
            }

            for (int numero : lista) {
                System.out.printf("%04d%n", numero);
            }
        }
    }

}