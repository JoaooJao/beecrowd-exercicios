package AdHoc;

import java.util.Scanner;

public class Bee1943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int colocation = sc.nextInt();

        if(colocation == 1){
            System.out.println("Top 1");
        } else if (colocation == 2 || colocation == 3) {
            System.out.println("Top 3");
        }else if (colocation == 4 || colocation == 5){
            System.out.println("Top 5");
        } else if (colocation >= 6 && colocation <=10) {
            System.out.println("Top 10");
        } else if (colocation >= 11 && colocation <=25) {
            System.out.println("Top 25");
        } else if (colocation >= 26 && colocation <= 50) {
            System.out.println("Top 50");
        }else{
            System.out.println("Top 100");
        }

    }
}
