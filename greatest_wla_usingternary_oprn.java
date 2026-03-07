import java.util.Scanner;

public class greatest_wla_usingternary_oprn {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1:");
        int a = sc.nextInt();
        System.out.print("enter number2:");
        int b = sc.nextInt();
        System.out.print("enter number 3:");
        int c = sc.nextInt();

        System.out.println((a>b) ? ((a>c) ? a : c) : ((b>c) ? b:c));
        // format of ternary  operator = condn ? sach : jhooth
        // or condn ?(condn? :) : (condn? : )
    }
}
