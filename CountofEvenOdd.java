import java.util.Scanner;

public class CountofEvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int even = 0;
        int odd = 0;
        int zero = 0;

        while (N != 0) {
            int digit = N % 10;
            N = N / 10;

            if (digit == 0) {
                zero++;
            } 
            else if (digit % 2 == 0) {
                even++;
            } 
            else {
                odd++;
            }
        }

        System.out.println("even numbers = " + even);
        System.out.println("odd numbers = " + odd);
        System.out.println("zero numbers = " + zero);

        sc.close();
    }
}