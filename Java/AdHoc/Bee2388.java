package AdHoc;

import java.util.Scanner;

public class Bee2388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int distance = 0;

        for (int i = 0; i< len; i++){
            int time = sc.nextInt();
            int velocity = sc.nextInt();
            distance += time * velocity;
        }
        System.out.println(distance);
    }
}
