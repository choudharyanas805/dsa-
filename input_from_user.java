package basic_cheeze_JAVA;
import java.util.Scanner;
public class input_from_user {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter a number = "+ " ");  // ln remove kyuki side me ajaiga
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.print("area is =  "+" "); // ln remove becoz side me answer ajaiga
        System.out.println(area);

    }
}
