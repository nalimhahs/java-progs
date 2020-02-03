/**
 * triangletype
 */

import java.util.Scanner;

public class triangletype {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a == b && b == c && c == a){
            System.out.println("Equilateral!");
        } else if(a == b || a == c || b == c){
            System.out.println("Isosceles!");
        } else {
            System.out.println("Scalene!");
        }
    }
}