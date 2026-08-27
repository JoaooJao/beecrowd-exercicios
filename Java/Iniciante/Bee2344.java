package Iniciante;
import java.util.Scanner;
public class Bee2344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int value = sc.nextInt();
        if(value == 0){
            System.out.println("E");
        } else if (value >= 1 && value <=35) {
            System.out.println("D");
        } else if (value >= 35 && value <=60) {
            System.out.println("C");
        }else if (value >= 61 && value <=85) {
            System.out.println("B");
        }else if (value >= 86 && value <=100) {
            System.out.println("A");
        }
    }
}
