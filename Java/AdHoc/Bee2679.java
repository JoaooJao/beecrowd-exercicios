package AdHoc;

import java.util.Scanner;

public class Bee2679 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if(value % 2 == 0){
            System.out.println(value+2);
        }else {
            System.out.println(value + 1);
        }
    }
}
