package if_else;

import java.util.Scanner;

public class magnitude_is_smaller_than_69 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = sc.nextInt();

        n = -n;  // neagtive positive bana daiga cheezo koh..


        if (n < 69){

            System.out.println("yes, smaller than 69");
        }
        else System.out.println("no, greater than 69");

        // magnitude mean |-89| = 89 . mean negative sai positive bana daiga..
    }
}
