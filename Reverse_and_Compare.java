import java.util.Scanner;

public class Reverse_and_Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");

        int n = sc.nextInt();

        int original = n;
        int rev = 0;

        while (n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if(original == rev) {
            System.out.println("is a palindrome");
        }
        else{
            System.out.println("is not a palindrome");
        }
        sc.close();
    }
    
}
