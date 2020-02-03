import java.util.Scanner;

/**
 * oddoreven
 */
public class oddoreven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println("Even!");
        } else {
            System.out.println("Odd!");
        }
    }
}