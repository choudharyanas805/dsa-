package basic_cheeze_JAVA;
import java.util.Scanner;
public class sqaureofnumber_by_take_input {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int n = sc.nextInt();
        int square = n*n;
        System.out.print("square is = ");
        System.out.println(square);
    }
}
