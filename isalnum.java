import java.util.Scanner;

/**
 * isalnum
 */
public class isalnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        char c = a.charAt(0);  

        if('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z'){
            System.out.println("Alphabet!");
        } else if(c >= '0' && c <= '9') {
            System.out.println("Number!");
        } else {
            System.out.println("Special Character!");
        }
    }
}