package if_else;

import java.util.Scanner;

public class absolutevalue_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a integer  number = ");
        int n = sc.nextInt();

        System.out.println("  ");

        if (n < 0) n = -n;  // mean phlai input diya n=  -6 thike fir n=-n so n=-(-6) toh it gives you 6
        System.out.println(n);
    }
}
