package if_else;

import java.util.Scanner;

public class area_of_rectangle_its_greater_than_parameter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a length:");
        int l = sc.nextInt();

        System.out.print("enter breadth :" );
        int b = sc.nextInt();

        if (l*b > 2*(l+b)){
            System.out.println("yes , area of rectangle is greater than its parameter");
        }
        else System.out.println("no");
    }
}
