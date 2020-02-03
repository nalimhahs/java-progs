/**
 * quadratic
 */

import java.util.Scanner;
import java.lang.Math;


public class quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        d = b*b - 4*a*c;

        if(a == 0){
            System.out.println("Invalid quadratic equation");
        } else if(d > 0){
            System.out.println((-b + Math.sqrt(d))/2*a);
            System.out.println((-b - Math.sqrt(d))/2*a);
        } else if(d == 0){
            System.out.println(-b/2*a);
        } else {
            // Fixed
            System.out.println(String.valueOf(-b/2*a) + '+' + String.valueOf(Math.sqrt(-d)/2*a) + 'i');
            System.out.println(String.valueOf(-b/2*a) + '-' + String.valueOf(Math.sqrt(-d)/2*a) + 'i');
        }
    }
}