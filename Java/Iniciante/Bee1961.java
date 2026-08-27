package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listPipe = new ArrayList<>();

        boolean endGame = true;
        int frogJump = sc.nextInt();
        int pipes = sc.nextInt();
        int resto = 0;

        for (int i = 0; i < pipes; i++) {
            int pipesHeight = sc.nextInt();
            listPipe.add(pipesHeight);
        }

        for (int i = 0; i < listPipe.size();) {
            resto = listPipe.get(i);
            i++;
            if(i == listPipe.size()){
                break;
            }
            resto = resto - listPipe.get(i);
            if(resto < frogJump * -1 || resto > frogJump){
                endGame = false;
                break;
            }
        }
        if(!endGame){
            System.out.println("GAME OVER");
        }else {
            System.out.println("YOU WIN");
        }
    }
}
