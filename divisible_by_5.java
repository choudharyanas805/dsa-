package if_else;

import java.util.Scanner;

public class divisible_by_5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a integer  number = ");
        int a = sc.nextInt();

        System.out.println(" ");
        if (a%5==0){
            System.out.println("yes, divisible by 5");
        }
        else {
            System.out.println("no");
        }
    }
}
