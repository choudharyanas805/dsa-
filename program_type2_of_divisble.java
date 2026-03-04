package if_else;

import java.util.Scanner;

public class program_type2_of_divisble {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int a = sc.nextInt();

        if(a%5==0 && a%3==0) System.out.println("riya"); //divisible by 5 only
        else if(a%3==0) System.out.println("banu"); //divisible by 3 only
        else if(a%5==0) System.out.println("apurva"); //divisible by 5or 3 both
        else System.out.println("isha");//not divisible by 5or3 both

        // ismai priority daini padthi hai if , else if mai ..
    }
}
