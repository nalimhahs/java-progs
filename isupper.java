import java.util.Scanner;

/**
 * isupper
 */
public class isupper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        char c = a.charAt(0);  

        if('a' <= c && c <= 'z') {
            System.out.println("Lowercase!");
        } else if('A' <= c && c <= 'Z') {
            System.out.println("Uppercase!");
        } else {
            System.out.println("Invalid!");
        }
    }
}