import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int original=a;
        int rev = 0;
        while (a>0) {
            int digit=a%10;
            a=a/10;
            rev= rev*10+digit;
            System.out.println(digit);
        }
        if (original==rev) {
            System.out.println("palindrome!!!!!!!!!!");
        }
        else{
            System.out.println("not palindrome.....");
        }
    }
}
