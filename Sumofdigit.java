import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int sum= 0;
        while (a>0) {
            int digit =a % 10;
            a = a/10;
            sum= sum+digit;

        }
        System.out.print(sum);
    }
}
