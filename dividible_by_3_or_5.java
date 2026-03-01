package if_else;

import java.util.Scanner;

public class dividible_by_3_or_5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :" );
        int n = sc.nextInt();

        if(n%5==0 || n%3==0){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
