package Iniciante;

import java.util.Scanner;

public class Bee2061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < v2; i++){
            String action = sc.nextLine().toUpperCase();
            if(action.equals("FECHOU")){
                v1 += 2 - 1;
            }else{
                v1 -= 1;
            }
        }
        System.out.println(v1);
    }
}
