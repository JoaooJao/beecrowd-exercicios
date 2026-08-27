package Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee2006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        int correct = 0;
        int teaType = sc.nextInt();

        int comp1 = sc.nextInt();
        numbers.add(comp1);
        int comp2 = sc.nextInt();
        numbers.add(comp2);
        int comp3 = sc.nextInt();
        numbers.add(comp3);
        int comp4 = sc.nextInt();
        numbers.add(comp4);
        int comp5 = sc.nextInt();
        numbers.add(comp5);
        for(int i = 0; i< numbers.size(); i++){
            if(numbers.get(i).equals(teaType)){
                correct ++;
            }
        }
        System.out.println(correct);

    }
}
