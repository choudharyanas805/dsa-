package if_else;

import java.util.Scanner;

public class inputand_four_digit_number_or_not_usingMULTIPLE_condn_andand_oror {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();

        if (n > 999 && n<=9999) System.out.println("four digit number");  //n<=9999 instead of n<10000 both iks correct
        else System.out.println("not");

        /* multiple condition using
        logical and - &&
        logical or - ||
         */
    }
}
