import java.util.Scanner;
public class ProductofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int N = sc.nextInt();

        int product = 1;
        int digit;
        
        while(N != 0) {
            digit = N % 10;
            product = product * digit;
            N = N / 10;
        }
        System.out.println("Product of digit is = " +product);
        sc.close();
    }
}
