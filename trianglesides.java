/**
 * trianglesides
 */

import java.util.Scanner;

public class trianglesides {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a + b < c || c + b < a || a + c < b){
            System.out.println("Valid triangle!");
        } else {
            System.out.println("Invalid angles!");
        }
    }
}