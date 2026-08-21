import java.util.Scanner;
public class ProductofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        int product = 1;
        int digit;

        while(n != 0) {
            digit = n % 10;
            product = product * digit;
            n = n / 10;
        }
        System.out.println("Product of digit is = " +product);
        sc.close();
    }
}
