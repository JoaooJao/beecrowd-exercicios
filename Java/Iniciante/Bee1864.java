package Iniciante;

import java.util.Scanner;

public class Bee1864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int letter = sc.nextInt();
        String message ="LIFE IS NOT A PROBLEM TO BE SOLVED";
        for(int i = 0; i<letter; i++){
            System.out.print(message.charAt(i));
        }
        System.out.println();
    }
}
