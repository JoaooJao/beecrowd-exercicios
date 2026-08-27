package AdHoc;

import java.util.Scanner;

public class Bee2339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        int value3 = sc.nextInt();
        for (int i = 1; i <= value1; i++) {
            value2 -= value3;
            if (value2 < 0) {
                break;
            }
        }
        if (value2 < 0){
            System.out.println("N");
        }else{
            System.out.println("S");
        }
    }
}
