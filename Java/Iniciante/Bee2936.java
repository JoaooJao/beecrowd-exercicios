package Iniciante;


import java.util.List;
import java.util.Scanner;

public class Bee2936 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        List<Integer> part = List.of(300,1500,600,1000,150);

        for(int i =0; i <= 4; i++){
            int qtd = sc.nextInt();
            total += qtd * (part.get(i));
        }
        System.out.println(total + 225);
    }
}
