/**
 * triangle
 */

import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > 0 && a < 180 && b > 0 && b < 180 && c > 0 && c < 180 && a+b+c == 180){
            System.out.println("Valid triangle!");
        } else {
            System.out.println("Invalid angles!");
        }
    }
}