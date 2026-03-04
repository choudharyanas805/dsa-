package if_else;
import java.util.Scanner;

public class side_of_the_triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number 1:");
        int a = sc.nextInt();
        System.out.print("enter a number 2 :");
        int b = sc.nextInt();
        System.out.print("enter a number 3 :");
        int c = sc.nextInt();
        sc.close();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("yes , this is side of triangle");
        }
        else{
            System.out.println("no, this is no side of triangle");
        }



    }
}
