package if_else;

import java.util.Scanner;

public class print_gratest_of_three {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1:");
        int a = sc.nextInt();

        System.out.print("enter number 2:");
        int b = sc.nextInt();

        System.out.print("enter number 3:");
        int c = sc.nextInt();

        // ismai code mai mean if,if,if teeno chalaigai jo correct woh print toh output 4,4,2 toh 4,4 print blki 4 anaa chahiyai toh use else if jissai first condn correct toh agai nhi chliaga


        //if( a >= b && a>=c){
        //    System.out.println(a);
        //}
        //if (b>=a && b>=c){
        //    System.out.println(b);
        //}
        //if(c>=a && c>=b) {
        //    System.out.println(c);
        //}

        // do this
       // if (a >= b && a >= c)
        //    System.out.println(a);
     //    else if (b >= a && b>=c)
       //  else if (c >= a && c>=b) {System.out.println(c);} //use khali else sout(c) yh  bhi sahi hai..
// but yh  bhi shi hai ham seekhaigai nested if else aur better kai lie..
        /* format of nested if else
        if{
           if (){}
           else }
        else{
           if(){}
           else{}
           }
         */

        if(a>=b && a>=c){
            System.out.println(a);
        }
        else { // yh b or c hoga
            if(b>=a && b>=c) System.out.println(b);
            else System.out.println(c);


        }

        }

    }

