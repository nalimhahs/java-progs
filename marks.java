/**
 * marks
 */

import java.util.Scanner;

public class marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a, b, c, d, e, avg;

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        e = sc.nextFloat();

        avg = a + b + c + d + e;
        avg /= 5;

        if (avg >= 90) {
            System.out.println("A");
        } else if (avg >= 80) {
            System.out.println("B");
        }else if (avg >= 70) {
            System.out.println("C");
        }else if (avg >= 60) {
            System.out.println("D");
        } else if (avg >= 40) {
            System.out.println("E");
        } else if (avg < 40) {
            System.out.println("F");
        }

    }
}