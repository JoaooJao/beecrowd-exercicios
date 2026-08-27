package AdHoc;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Bee3048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int len = sc.nextInt();
        int total = 0;

        for(int i = 1; i< len + 1; i++){
            int v = sc.nextInt();
            lista.add(v);
        }
        for(int i = 1; i < lista.size(); i ++){
            if(!Objects.equals(lista.get(i), lista.get(i-1))){
                total += 1;
            }
        }
        System.out.println(total + 1); // Total manipulado, o total retorna sempre uma valor abaixo, então acrescentei o valor 1 ao final.
    }
}
