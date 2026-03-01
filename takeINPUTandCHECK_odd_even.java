package if_else;
import java.util.Scanner;
public class takeINPUTandCHECK_odd_even {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a integer  number = ");
        int a = sc.nextInt();

        System.out.println(" ");
        if (a%2==0){
            System.out.println("this is even number");
        }
        else {
            System.out.println("this is odd number");  /*
            else system.out.println("this is odd number") same as if kai lie bss {} yh use nhi hongai
            but agr tum single line print ho
            agr multi [ple line print use {} method*/
        }

    }
}
