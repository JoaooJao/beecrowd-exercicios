package AdHoc;

import java.util.Scanner;

public class Bee2434 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int period = sc.nextInt();
        int value = sc.nextInt();
        int minValue = value;
        for(int i = 0; i<period; i++){
            int movement = sc.nextInt();
            value += movement;
            if(value < minValue){
                minValue = value;
            }
        }
        System.out.println(minValue);

    }
}
