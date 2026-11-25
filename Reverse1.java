import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
         
        while (a>0) {
            int digit= a%10;
            a=a/10;
            System.out.print(digit);
        }

        sc.close();
    }
}
