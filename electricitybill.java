/**
 * electricitybill
 */

import java.util.Scanner;

public class electricitybill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        double amt;

        if(units <= 50){
            amt = units*0.5;
        } else if(units <= 150){
            amt = 25 + (units -50)*0.75;
        } else if(units <= 250){
            amt = 100 + (units - 150)*1.2;
        } else {
            amt = 220 + (units-250)*1.5;
        }

        amt = amt + amt*0.2;

        System.out.println(amt);
    }
}