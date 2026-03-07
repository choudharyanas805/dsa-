import java.util.Scanner;

public class ternary_operator_odd_even {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();


        // if (n%2==0) System.out.println("even");
        // else System.out.println("odd");

        // format of ternary operator === condition ? sach : jooth

        System.out.println(n+" "+"is"+ " "+ ((n%2==0) ? "even" : "odd"));
        //or
        System.out.println((n%2==0) ? "even" : "odd");

    }
}
