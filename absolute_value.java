package if_else;

import java.util.Scanner;

public class absolute_value {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a integer  number = ");
        int n = sc.nextInt();

        System.out.println(" ");
        // absolute mean kio bhi number ham input dai yh negative ho yh positive print positive ho hbai voh number
        if (n>=0){
            System.out.println(n);
        }
        else System.out.println(-n);

    }
}
