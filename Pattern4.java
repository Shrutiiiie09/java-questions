import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x to be printed = ");
        int n = sc.nextInt();
        System.out.println("here is your pattern = ");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
               System.out.print("x"); 
            }
            System.out.println(" ");
        }
    }
}
