/**
 * isalpha
 */

import java.util.Scanner;

public class isalpha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        char c = a.charAt(0);  

        if('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z'){
            System.out.println("Alphabet!");
        } else {
            System.out.println("Not Alphabet!");
        }
    }
}