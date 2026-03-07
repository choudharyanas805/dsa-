import java.util.Scanner;

public class input_least_using_nestedifelse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1:");
        int a = sc.nextInt();
        System.out.print("enter number2:");
        int b = sc.nextInt();
        System.out.print("enter number 3:");
        int c = sc.nextInt();

        if (a<b){
            if (a<c) System.out.println(a);
            else System.out.println(c);
        }
        else { // a>b mean b chotan hai
            if (b < c) System.out.println(b);
            else System.out.println(c);
        }
    }
}
