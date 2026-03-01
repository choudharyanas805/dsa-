package if_else;

import java.util.Scanner;

public class integer_or_not {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        double a = sc.nextDouble();  //a=3.13
        int n = (int)a ; // n = 3
        if (a-n==0){
            System.out.println("yes,it is integer");
        }
        else{
            System.out.println("not, integer");
        }



    }
}
