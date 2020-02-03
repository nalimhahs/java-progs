/**
 * calcsalary
 */

import java.util.Scanner;

public class calcsalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float da, hra;

        if(a < 10000){
            da = a*0.8f;
            hra = a*0.25f;
        } else if(a <= 20000){
            da = a*0.9f;
            hra = a*0.25f;
        } else {
            da = a*0.95f;
            hra = a*0.3f;
        }

        System.out.println(a + da + hra);
    }
}