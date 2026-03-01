package if_else;

import java.util.Scanner;

public class program_howMUCH_profit_and_LOSS_take2_input_sellingPRICE_costPRICE{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter selling price = ");
        double selling_price = sc.nextDouble();
        System.out.print("enter cost price = ");
        double cost_price = sc.nextDouble();

        sc.close(); // ab tum aigai input nhi lai sktai

        if (selling_price > cost_price){
            System.out.println("profit is " + (selling_price - cost_price));
        }
        else if (selling_price == cost_price) {
            System.out.println("no profit and no loss");

        } else {
            System.out.println("loss is " + (cost_price - selling_price));
        }
        /* ham use kr sktai hai if , else if , else ki jagah if , if ,if but
        jab tu input laiga toh if if if teeno check hoga but
        if else if else mai first check if correct toh niche ka check nhi hoga.. fir agr if incoorect toh elseif check hoga bss thoda hi differnce hai
         */
    }
}